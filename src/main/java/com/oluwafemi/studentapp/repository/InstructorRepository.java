package com.oluwafemi.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwafemi.studentapp.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
