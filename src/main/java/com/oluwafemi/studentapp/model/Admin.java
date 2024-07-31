package com.oluwafemi.studentapp.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Admin extends User {

    @Column
    private String firstName;

    @Column
    private String lastName;
}