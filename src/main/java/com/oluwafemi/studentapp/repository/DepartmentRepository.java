package com.oluwafemi.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwafemi.studentapp.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}