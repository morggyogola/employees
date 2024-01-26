package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity

public class Employee {
    private String name;
    private Long age;
    private String location;
    private String email;
    private String department;

}
    //public void setName(String morgan) {
//        this.name=morgan;


//    public void setDepartment(String backend) {
//        this.department=backend;
//    }
//
//    public void setEmail(String mail) {
//        this.email=mail;
//    }
//
//    public void setLocation(String baghdad) {
//        this.location=baghdad;
//    }
//
//    public void setAge(long l) {
//        this.age=l;
//    }

