package com.example.Better.student;

import org.springframework.stereotype.Component;
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
                        "Clint",
                        "cjs@gmail.com",
                        LocalDate.of(1992, Month.JULY, 23),
                        29
                )
        );
    }
}
