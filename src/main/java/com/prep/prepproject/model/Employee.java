package com.prep.prepproject.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
public class Employee {
    @Id
    private Long id;
    private String name;
    private Designation designation;

    public Employee(Long id, String name, Designation designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public Employee() {
    }
}
