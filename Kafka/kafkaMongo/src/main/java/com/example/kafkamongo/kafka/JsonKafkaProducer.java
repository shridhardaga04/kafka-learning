package com.example.kafkamongo.kafka;

import com.example.kafkamongo.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaProducer {

    private final KafkaTemplate<String, Student> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, Student> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Student data) {
        log.info(String.format("Message send: %s", data.toString()));

        Message<Student> message = MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, "kafka_mongodb_demo").build();

        kafkaTemplate.send(message);
    }
}
