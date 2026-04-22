package com.ironhack.labrelationship.repository;

import com.ironhack.labrelationship.entity.Guest;
import com.ironhack.labrelationship.enums.GuestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {

    List<Guest> findByStatus(GuestStatus status);
}
