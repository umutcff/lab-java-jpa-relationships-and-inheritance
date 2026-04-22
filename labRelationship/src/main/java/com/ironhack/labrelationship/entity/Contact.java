package com.ironhack.labrelationship.entity;

import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String title;

    @Embedded
    private Name name;
}