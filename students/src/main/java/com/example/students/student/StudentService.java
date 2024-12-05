package com.example.students.student;

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

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Velma",
                        "mystery@gmail.com",
                        LocalDate.of(2001, Month.FEBRUARY, 8),
                        6));
    }
}
