package com.mac.deployment.example.demo.services;

import com.mac.deployment.example.demo.domain.entity.Student;
import com.mac.deployment.example.demo.domain.persistence.StudentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private final StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> findAll() {
        LOGGER.info("Execute method findAll()");
        return studentDao.findAll();
    }
}
