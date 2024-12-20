package com.mac.deployment.example.demo.domain.entity;

public class Student {

    private Integer id;
    private String name;
    private String lastName;
    private int age;
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
