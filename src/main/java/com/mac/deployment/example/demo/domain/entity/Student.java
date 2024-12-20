package com.mac.deployment.example.demo.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "AGE", nullable = false)
    private int age;

    @Column(name = "DEGREE", nullable = false)
    private String degree;

    public Student() {}

    public Student(Integer id, String name, String lastName, int age, String degree) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.degree = degree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
