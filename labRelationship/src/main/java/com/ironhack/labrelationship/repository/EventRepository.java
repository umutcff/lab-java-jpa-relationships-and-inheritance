package com.ironhack.labrelationship.repository;

import com.ironhack.labrelationship.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
