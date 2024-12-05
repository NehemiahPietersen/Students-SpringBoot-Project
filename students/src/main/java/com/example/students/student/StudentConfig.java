package com.example.students.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student velma = new Student(
                    "Velma",
                    "mystery@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 8),
                    6);
            Student daphne = new Student(
                    "Daphne",
                    "scoobydoo@gmail.com",
                    LocalDate.of(1998, Month.JUNE, 13),
                    6);

            repository.saveAll(
                    List.of(velma, daphne));
        };
    };
}
