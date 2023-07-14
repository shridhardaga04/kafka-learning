package com.example.kafkamongo.kafka;

import com.example.kafkamongo.entity.Student;
import com.example.kafkamongo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @Autowired
    StudentRepository studentRepository;


    @KafkaListener(topics = "kafka_mongodb_demo", groupId = "my-group")
    public void consume(Student student) {
        log.info(String.format("Json message received -> %s", student));
        studentRepository.insert(student);
    }
}
