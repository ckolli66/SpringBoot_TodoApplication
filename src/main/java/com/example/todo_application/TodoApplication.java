package com.example.todo_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

    // Iterate over environment variables and set them as system properties
    // This is a common method to make them accessible to Spring Boot

    public static void main(String[] args) {
//        Dotenv dotenv = Dotenv.configure().load();
//        dotenv.entries().forEach(e ->System.setProperty(e.getKey(),e.getValue()));
        SpringApplication.run(TodoApplication.class, args);
    }

}
