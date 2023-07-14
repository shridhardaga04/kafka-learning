package com.example.mongodb.repository;

import com.example.mongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    Student insert(Student student);

    List<Student> findByName(String name);

}
