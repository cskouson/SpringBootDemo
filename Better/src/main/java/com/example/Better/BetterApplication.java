package com.example.Better;

import com.example.Better.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class BetterApplication {

	public static void main(String[] args) {

		SpringApplication.run(BetterApplication.class, args);
	}

}
