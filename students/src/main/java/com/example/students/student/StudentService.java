package com.example.students.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    /**
     * This is not only just a regular component -> Bean
     * This will act as our service
     * Service keyword tells you this class is a SERVICE class
     */

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll(); // returns list of all Students in the DB
    }
}
