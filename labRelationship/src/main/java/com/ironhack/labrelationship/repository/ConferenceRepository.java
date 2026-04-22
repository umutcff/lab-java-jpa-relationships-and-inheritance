package com.ironhack.labrelationship.repository;

import com.ironhack.labrelationship.entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
