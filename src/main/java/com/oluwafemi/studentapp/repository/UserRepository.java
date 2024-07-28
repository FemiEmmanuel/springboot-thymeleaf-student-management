package com.oluwafemi.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwafemi.studentapp.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
