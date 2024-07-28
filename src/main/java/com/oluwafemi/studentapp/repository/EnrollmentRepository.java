package com.oluwafemi.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwafemi.studentapp.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}