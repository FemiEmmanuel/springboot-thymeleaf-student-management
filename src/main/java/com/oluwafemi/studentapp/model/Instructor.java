package com.oluwafemi.studentapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
// @PrimaryKeyJoinColumn(name = "user_id")

public class Instructor extends User {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(mappedBy = "instructor")
    private Set<Course> courses = new HashSet<>();

}
