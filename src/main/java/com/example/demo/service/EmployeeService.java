package com.example.demo.service;


import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);
    List<Employee> getEmployees();
}
