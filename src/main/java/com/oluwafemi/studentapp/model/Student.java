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
// @PrimaryKeyJoinColumn(name = "user_id")

public class Student extends User {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private int age;

    @OneToMany(mappedBy = "student")
    private Set<Enrollment> enrollments = new HashSet<>();
}
