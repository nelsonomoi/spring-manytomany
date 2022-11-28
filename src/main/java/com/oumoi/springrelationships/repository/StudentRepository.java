package com.oumoi.springrelationships.repository;

import com.oumoi.springrelationships.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
