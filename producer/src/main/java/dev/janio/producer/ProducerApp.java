package dev.janio.producer;

import dev.janio.DetectorDeIncendio;
import dev.janio.SensorDht11;
import dev.janio.SensorDht22;
import dev.janio.SensorFlame01;
import dev.janio.SensorMq2;
import dev.janio.SensorMq9;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

public class ProducerApp {
    public static void main(String[] args) {
        var properties = new Properties();
        // normal producer
        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
        properties.setProperty("acks", "all");
        properties.setProperty("retries", "10");
        // avro part
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
        properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");

        var producer = new KafkaProducer<String, DetectorDeIncendio>(properties);

        var topic = "detector-de-incendio-avro";

        var tempoDeEspera = 5;

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

                var producerRecord = new ProducerRecord<String, DetectorDeIncendio>(
                        topic, detectorDeIncendio
                );

                System.out.println(detectorDeIncendio);

                producer.send(producerRecord, (metadata, exception) -> {
                    if (exception == null) {
                        System.out.println(metadata);
                    } else {
                        exception.printStackTrace();
                    }
                });

                Thread.sleep(tempoDeEspera * 1000);
            } catch (InterruptedException ie){
                Thread.currentThread().interrupt();
                producer.flush();
                producer.close();
            }
        }
    }
}
