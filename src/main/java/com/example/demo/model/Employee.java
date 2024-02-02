package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Long age;

    @Column(name = "location")
    private String location;

    @Column(name = "email")
    private String email;

    @Column(name = "department")
    private String department;
@CreationTimestamp
@Column(name="created_at", nullable = false,updatable = false)
    private Date created_at;
@UpdateTimestamp
@Column(name="updated_at")
    private  Date updated_at;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}