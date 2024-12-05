package com.example.students.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { // params: type is Student, ID type is Long
    /**
     * DATA ACCESS LAYER
     * JPA REPOSITORY
     * This will be used to interact directly with the Database
     * What we want to do is use this repository inside our service
     */

    // in sql it will search: SELECT * FROM student WHERE email = ? (whatever is
    // passed)
    @Query("SELECT s FROM Student s WHERE s.email = ?1") // in other words this is JPQL
    Optional<Student> findStudentByEmail(String email);
}
