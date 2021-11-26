package dev.janio.producer;

import dev.janio.DetectorDeIncendio;
import dev.janio.SensorDht11;
import dev.janio.SensorDht22;
import dev.janio.SensorFlame01;
import dev.janio.SensorMq2;
import dev.janio.SensorMq9;
import dev.janio.producer.environment.DefaultEnvironmentProperties;
import dev.janio.producer.environment.EnvironmentProperties;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.KafkaException;
import org.apache.kafka.common.errors.ProducerFencedException;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

public class ProducerApp {
    private static final EnvironmentProperties env = new DefaultEnvironmentProperties();
    private static final String KAFKA_BOOTSTRAP_SERVERS = env.getEnvironmentProperties("kafka.bootstrap.servers").orElseThrow();
    private static final String KAFKA_ACKS = env.getEnvironmentProperties("kafka.acks").orElseThrow();
    private static final String KAFKA_ENABLE_IDEMPOTENCE = env.getEnvironmentProperties("kafka.enable.idempotence").orElseThrow();
    private static final String KAFKA_RETRIES = env.getEnvironmentProperties("kafka.retries").orElseThrow();
    private static final String KAFKA_TRANSACTIONAL_ID = env.getEnvironmentProperties("kafka.transactional.id").orElseThrow();
    private static final String KAFKA_MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION = env.getEnvironmentProperties("kafka.max.in.flight.requests.per.connection").orElseThrow();
    private static final String KAFKA_SCHEMA_REGISTRY_URL = env.getEnvironmentProperties("kafka.schema.registry.url").orElseThrow();
    private static final String NOME_DO_TOPICO = env.getEnvironmentProperties("nome.do.topico").orElseThrow();
    private static final int TEMPO_DE_ESPERA_EM_MILISEGUNDOS = Integer.parseInt(env.getEnvironmentProperties("tempo.de.espera.em.milisegundos").orElseThrow());
    private static final int TEMPO_DE_ESPERA_EM_NANOSEGUNDOS = Integer.parseInt(env.getEnvironmentProperties("tempo.de.espera.em.nanosegundos").orElseThrow());

    public static void main(String[] args) {
        var properties = new Properties();
        // normal producer
        properties.setProperty("bootstrap.servers", KAFKA_BOOTSTRAP_SERVERS);
        properties.setProperty("acks", KAFKA_ACKS);
        properties.setProperty("retries", KAFKA_RETRIES);
        //exactly-once
        properties.setProperty("enable.idempotence", KAFKA_ENABLE_IDEMPOTENCE);
        properties.setProperty("transactional.id", KAFKA_TRANSACTIONAL_ID);
        properties.setProperty("max.in.flight.requests.per.connection", KAFKA_MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION);
        // avro part
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
        properties.setProperty("schema.registry.url", KAFKA_SCHEMA_REGISTRY_URL);

        var producer = new KafkaProducer<String, DetectorDeIncendio>(properties);

        //exactly-once
        producer.initTransactions();

        var counter = 0;
        var startTime = System.nanoTime();
        var nanoToSeconds = 0.000000001;

        while (true) {
            try {
                var detectorDeIncendio = DetectorDeIncendio.newBuilder()
                        .setDht11(SensorDht11.newBuilder()
                                .setUmidade(ThreadLocalRandom.current().nextInt(20, 90))
                                .setTemperatura(ThreadLocalRandom.current().nextInt(0, 50))
                                .build())
                        .setDht22(SensorDht22.newBuilder()
                                .setUmidade(ThreadLocalRandom.current().nextInt(0, 100))
                                .setTemperatura(ThreadLocalRandom.current().nextInt(-40, 80))
                                .build())
                        .setFlame01(SensorFlame01.newBuilder()
                                .setEspectroDeLuz(ThreadLocalRandom.current().nextInt(760, 1100))
                                .setTemperatura(ThreadLocalRandom.current().nextInt(-25, 85))
                                .build())
                        .setMq2(SensorMq2.newBuilder()
                                .setGasCombustivel(ThreadLocalRandom.current().nextInt(300, 10000))
                                .build())
                        .setMq9(SensorMq9.newBuilder()
                                .setGasCombustivel(ThreadLocalRandom.current().nextInt(100, 10000))
                                .setCo2(ThreadLocalRandom.current().nextInt(10, 1000))
                                .build())
                        .build();

                var producerRecord = new ProducerRecord<String, DetectorDeIncendio>(NOME_DO_TOPICO, detectorDeIncendio);

                // debug
                //System.out.println(detectorDeIncendio);

                producer.beginTransaction();

                producer.send(producerRecord//, (metadata, exception) -> {
                //    if (exception == null) {
                //        System.out.println(metadata);
                //    } else {
                //        exception.printStackTrace();
                //    }
                //}
                );

                producer.commitTransaction();

                counter++;
                var timer = ( System.nanoTime() - startTime ) * nanoToSeconds;
                var throughput = counter / timer;
                System.out.println("Mensagens: " + counter + "\nTempo: " + timer + "\nThroughput: " + throughput + " msg/s");

            //    Thread.sleep(TEMPO_DE_ESPERA_EM_MILISEGUNDOS, TEMPO_DE_ESPERA_EM_NANOSEGUNDOS);
            //} catch (InterruptedException ie){
            //    Thread.currentThread().interrupt();
            //    producer.flush();
            //    producer.close();
            } catch(ProducerFencedException e) {
                producer.close();
            } catch(KafkaException e) {
                producer.abortTransaction();
            }
        }
    }
}
