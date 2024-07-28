package com.oluwafemi.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwafemi.studentapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
