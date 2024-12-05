package com.example.students.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Scooby-doo",
                        "mystery@gmail.com",
                        LocalDate.of(2001, Month.FEBRUARY, 8),
                        6));
    }
}
