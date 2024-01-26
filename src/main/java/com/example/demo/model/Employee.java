package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Employee {
    private String name;
    private  Long age;
    private String location;
    private String email;
    private  String department;

    public void setName(String morgan) {
    }

    public void setAge(int i) {
    }

    public void setDepartment(String backend) {
    }

    public void setEmail(String mail) {
    }

    public void setLocation(String baghdad) {
    }
}
