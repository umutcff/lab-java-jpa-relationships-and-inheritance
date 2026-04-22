package com.ironhack.labrelationship.repository;

import com.ironhack.labrelationship.entity.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationRepository extends JpaRepository<Association, Long> {
}
