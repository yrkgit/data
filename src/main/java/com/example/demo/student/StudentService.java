package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> geStudents() {
        return List.of(
                new Student(
                        1L,
                        "Jan",
                        "jan@asd.com",
                        LocalDate.of(1234, Month.APRIL,12),
                        45
                )
        );
    }
}
