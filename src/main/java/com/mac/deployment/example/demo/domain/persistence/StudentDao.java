package com.mac.deployment.example.demo.domain.persistence;

import com.mac.deployment.example.demo.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {
}
