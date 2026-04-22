package com.ironhack.labrelationship.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<Division> divisions;
}
