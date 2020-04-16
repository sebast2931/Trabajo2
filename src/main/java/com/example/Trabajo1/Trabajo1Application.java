package com.example.Trabajo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})

public class Trabajo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Trabajo1Application.class, args);
	}

}
