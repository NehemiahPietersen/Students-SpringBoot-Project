package com.example.students.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { // params: type is Student, ID type is Long
    /**
     * DATA ACCESS LAYER
     * JPA REPOSITORY
     * This will be used to interact directly with the Database
     * What we want to do is use this repository inside our service
     */

}
