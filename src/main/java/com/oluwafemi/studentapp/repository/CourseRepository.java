package com.oluwafemi.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwafemi.studentapp.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}