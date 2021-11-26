package dev.janio.consumer;

import dev.janio.DetectorDeIncendio;
import dev.janio.consumer.environment.DefaultEnvironmentProperties;
import dev.janio.consumer.environment.EnvironmentProperties;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class ConsumerApp {
    private static final EnvironmentProperties env = new DefaultEnvironmentProperties();
    private static final String KAFKA_BOOTSTRAP_SERVERS = env.getEnvironmentProperties("kafka.bootstrap.servers").orElseThrow();
    private static final String KAFKA_GROUP_ID = env.getEnvironmentProperties("kafka.group.id").orElseThrow();
    private static final String KAFKA_ENABLE_AUTO_COMMIT = env.getEnvironmentProperties("kafka.enable.auto.commit").orElseThrow();
    private static final String KAFKA_ISOLATION_LEVEL = env.getEnvironmentProperties("kafka.isolation.level").orElseThrow();
    private static final String KAFKA_AUTO_OFFSET_RESET = env.getEnvironmentProperties("kafka.auto.offset.reset").orElseThrow();
    private static final String KAFKA_GROUP_INSTANCE_ID = env.getEnvironmentProperties("kafka.group.instance.id").orElseThrow();
    private static final String KAFKA_SCHEMA_REGISTRY_URL = env.getEnvironmentProperties("kafka.schema.registry.url").orElseThrow();
    private static final String KAFKA_SPECIFIC_AVRO_READER = env.getEnvironmentProperties("kafka.specific.avro.reader").orElseThrow();
    private static final String NOME_DO_TOPICO = env.getEnvironmentProperties("nome.do.topico").orElseThrow();
    private static final Duration CONSUMER_POLL_TIMEOUT = Duration.ofMillis(Long.parseLong(env.getEnvironmentProperties("consumer.poll.timeout").orElseThrow()));

    public static void main(String[] args) {
        Properties properties = new Properties();
        // consumer
        properties.setProperty("bootstrap.servers", KAFKA_BOOTSTRAP_SERVERS);
        properties.put("group.id", KAFKA_GROUP_ID);
        properties.put("enable.auto.commit", KAFKA_ENABLE_AUTO_COMMIT);
        properties.put("auto.offset.reset", KAFKA_AUTO_OFFSET_RESET);
        // exactly-once
        properties.put("isolation.level", KAFKA_ISOLATION_LEVEL);
        // evita rebalanceamento
        properties.put("kafka.group.instance.id", KAFKA_GROUP_INSTANCE_ID);
        // avro (deserializer)
        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        properties.setProperty("value.deserializer", KafkaAvroDeserializer.class.getName());
        properties.setProperty("schema.registry.url", KAFKA_SCHEMA_REGISTRY_URL);
        properties.setProperty("specific.avro.reader", KAFKA_SPECIFIC_AVRO_READER);

        var kafkaConsumer = new KafkaConsumer<String, DetectorDeIncendio>(properties);
        kafkaConsumer.subscribe(Collections.singleton(NOME_DO_TOPICO));

        System.out.println("Waiting for data...");

        var counter = 0;
        var startTime = System.nanoTime();
        var nanoToSeconds = 0.000000001;

        while (true) {
            //System.out.println("Polling");
            ConsumerRecords<String, DetectorDeIncendio> records = kafkaConsumer.poll(CONSUMER_POLL_TIMEOUT);

            for (ConsumerRecord<String, DetectorDeIncendio> record : records){
                DetectorDeIncendio detectorDeIncendio = record.value();
                //TODO: escrever uma função que grava os dados em um arquivo
                System.out.println(detectorDeIncendio);
            }

            //kafkaConsumer.commitSync();

            counter++;
            var timer = ( System.nanoTime() - startTime ) * nanoToSeconds;
            var throughput = counter / timer;
            System.out.println("Mensagens: " + counter + "\nTempo: " + timer + "\nThroughput: " + throughput + " msg/s");
        }
    }
}
