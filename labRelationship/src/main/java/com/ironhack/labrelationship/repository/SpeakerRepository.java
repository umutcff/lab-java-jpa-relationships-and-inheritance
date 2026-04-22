package com.ironhack.labrelationship.repository;

import com.ironhack.labrelationship.entity.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
