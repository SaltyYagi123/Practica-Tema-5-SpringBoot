package com.example.demo;

import java.time.LocalDate;

public class Estudiante {
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;


    public Long getId() {
        return this.id;
    }
    //public check
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Estudiante(Long id, String name, String email, LocalDate dateOfBirth, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }


}
