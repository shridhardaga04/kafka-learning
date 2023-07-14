package com.example.kafka.stage2.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer2 {
    @KafkaListener(topics = "topic2", groupId = "consumer-group2")
    public void consume(String message) {
        log.info(String.format("Consumer 2 - Received message: %s", message));
    }
}