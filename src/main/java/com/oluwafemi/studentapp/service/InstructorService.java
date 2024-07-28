package com.oluwafemi.studentapp.service;

import org.springframework.stereotype.Service;

import com.oluwafemi.studentapp.model.Instructor;
import com.oluwafemi.studentapp.repository.InstructorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public Instructor getInstructorById(Long id) {
        return instructorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Instructor not found"));
    }

    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }
}
