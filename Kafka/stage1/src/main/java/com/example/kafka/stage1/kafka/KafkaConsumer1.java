package com.example.kafka.stage1.kafka;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer1 {
    @KafkaListener(topics = "kafka-topic", groupId = "group1")
    public void consume(String message) {
        log.info(String.format("Consumer 1 - Received message: %s", message));
    }
}
