package com.oluwafemi.studentapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Department {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "department")
    private Set<Instructor> instructors = new HashSet<>();

    @OneToMany(mappedBy = "department")
    private Set<Course> courses = new HashSet<>();
}
