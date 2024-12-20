package com.mac.deployment.example.demo.services;

import com.mac.deployment.example.demo.domain.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getStudents() {
        return createStudents();
    }

    private List<Student> createStudents() {
        return List.of(
                new Student(1, "Manuel", "Pedrera", 30, "Ing. Informatica"),
                new Student(2, "Teodoro", "Del Rosario", 25, "Ing. Industrial"),
                new Student(3, "Francisco", "Montero", 45, "Ing. Alimentaria")
        );
    }
}
