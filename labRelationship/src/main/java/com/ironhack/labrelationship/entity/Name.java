package com.ironhack.labrelationship.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {

    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
}