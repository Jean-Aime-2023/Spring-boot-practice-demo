package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student aime = new Student(
                    "Aime",
                    "aime@gmail.com",
                    LocalDate.of(2000, 1, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, 3, 12)
            );

            repository.saveAll(
                List.of(aime,alex)
            );
        };
    }
}
