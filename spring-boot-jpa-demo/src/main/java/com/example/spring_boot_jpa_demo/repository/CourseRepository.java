package com.example.spring_boot_jpa_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_jpa_demo.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
