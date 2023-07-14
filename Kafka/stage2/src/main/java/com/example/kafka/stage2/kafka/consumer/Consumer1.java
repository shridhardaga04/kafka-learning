package com.example.kafka.stage2.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer1 {
    @KafkaListener(topics = "topic1", groupId = "consumer-group1")
    public void consume(String message) {
        log.info(String.format("Consumer 1 - Received message: %s", message));
    }
}