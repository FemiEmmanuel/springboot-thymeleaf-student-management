package com.oluwafemi.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwafemi.studentapp.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}