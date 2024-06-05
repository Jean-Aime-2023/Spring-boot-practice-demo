package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
            return List.of(
                new Student(
                    1L,
                    "Aime",
                    "aime@gmail.com",
                    LocalDate.of(2000, 1, 5),
                    21
                )
        );
    }

}
