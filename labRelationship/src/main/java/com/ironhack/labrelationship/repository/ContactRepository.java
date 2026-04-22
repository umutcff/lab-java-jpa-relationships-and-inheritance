package com.ironhack.labrelationship.repository;

import com.ironhack.labrelationship.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
