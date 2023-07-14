package com.example.kafka.stage2.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer4 {
    @KafkaListener(topics = "topic4", groupId = "consumer-group4")
    public void consume(String message) {
        log.info(String.format("Consumer 4 - Received message: %s", message));
    }
}