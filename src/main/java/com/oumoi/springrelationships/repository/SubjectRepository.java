package com.oumoi.springrelationships.repository;

import com.oumoi.springrelationships.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
