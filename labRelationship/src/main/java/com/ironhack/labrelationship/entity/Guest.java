package com.ironhack.labrelationship.entity;

import com.ironhack.labrelationship.enums.GuestStatus;
import jakarta.persistence.*;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;
}
