package com.ironhack.labrelationship.repository;

import com.ironhack.labrelationship.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
