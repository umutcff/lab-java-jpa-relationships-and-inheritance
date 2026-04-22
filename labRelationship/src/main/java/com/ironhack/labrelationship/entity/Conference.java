package com.ironhack.labrelationship.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany
    private List<Speaker> speakers;
}
