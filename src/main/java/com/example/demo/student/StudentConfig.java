package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student adam = new Student(
                    "Adam",
                    "adam@asd.pl",
                    LocalDate.of(2000, APRIL, 2)
            );
            Student jan = new Student(
                    "Jan",
                    "Jan@asd.pl",
                    LocalDate.of(2002, MARCH, 15)
            );
            repository.saveAll(
                    List.of(adam,jan)
            );
        };
    }
}
