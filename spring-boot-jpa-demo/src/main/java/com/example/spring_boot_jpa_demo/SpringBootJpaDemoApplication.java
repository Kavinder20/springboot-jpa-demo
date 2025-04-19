package com.example.spring_boot_jpa_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spring_boot_jpa_demo.entity.Course;
import com.example.spring_boot_jpa_demo.repository.CourseRepository;

@SpringBootApplication
public class SpringBootJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	}
	
	
	@Bean
    public CommandLineRunner demoData(CourseRepository repository) {
        return args -> {
            // Saving 3 Course objects into DB
            repository.save(new Course(1L, "Java Basics", "Learn the fundamentals of Java."));
            repository.save(new Course(2L, "Spring Boot", "Build REST APIs with Spring Boot."));
            repository.save(new Course(3L, "JPA Crash Course", "Understand how ORM works."));

            // Fetch all from DB and print them
            repository.findAll().forEach(course -> {
                System.out.println(course.getId() + ": " + course.getName() + " - " + course.getDescription());
            });
        };
    }

}
