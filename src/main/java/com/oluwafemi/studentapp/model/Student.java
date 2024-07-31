package com.oluwafemi.studentapp.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends User {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String dateOfBirth;

    @Column
    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(unique = true)
    private String matricNumber;

    @Column
    private String phoneNumber;

    @Column
    private String nationality;

    @Column
    private String emergencyContact;

    @Column
    private String major;

    @Column
    private double gpa;

    @OneToMany(mappedBy = "student")
    private Set<Enrollment> enrollments = new HashSet<>();

    public enum Gender {
        MALE,
        FEMALE
    }
}

