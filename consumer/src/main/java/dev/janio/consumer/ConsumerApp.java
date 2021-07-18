package dev.janio.consumer;

import dev.janio.DetectorDeIncendio;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Collections;
import java.util.Properties;

public class ConsumerApp {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // normal consumer
        properties.setProperty("bootstrap.servers","127.0.0.1:9092");
        properties.put("group.id", "detector-de-incendio-consumer-group-v1");
        properties.put("auto.commit.enable", "false");
        properties.put("auto.offset.reset", "earliest");

        // avro part (deserializer)
        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        properties.setProperty("value.deserializer", KafkaAvroDeserializer.class.getName());
        properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");
        properties.setProperty("specific.avro.reader", "true");

        var kafkaConsumer = new KafkaConsumer<String, DetectorDeIncendio>(properties);
        String topic = "detector-de-incendio-avro";
        kafkaConsumer.subscribe(Collections.singleton(topic));

        System.out.println("Waiting for data...");

        while (true) {
            System.out.println("Polling");
            ConsumerRecords<String, DetectorDeIncendio> records = kafkaConsumer.poll(1000);

            for (ConsumerRecord<String, DetectorDeIncendio> record : records){
                DetectorDeIncendio detectorDeIncendio = record.value();
                System.out.println(detectorDeIncendio);
            }

            kafkaConsumer.commitSync();
        }
    }
}