package com.oluwafemi.studentapp.service;

import org.springframework.stereotype.Service;

import com.oluwafemi.studentapp.model.Course;
import com.oluwafemi.studentapp.repository.CourseRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
