package com.example.students.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public String getStudents() {
        return "Students are here";
    }
}
