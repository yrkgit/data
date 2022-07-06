package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//<Type to work on, type of id column>
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
