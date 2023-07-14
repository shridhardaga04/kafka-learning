package com.example.kafkamongo.controller;

import com.example.kafkamongo.entity.Student;
import com.example.kafkamongo.kafka.JsonKafkaProducer;
import com.example.kafkamongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private JsonKafkaProducer kafkaProducer;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Student student) {
        kafkaProducer.sendMessage(student);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
