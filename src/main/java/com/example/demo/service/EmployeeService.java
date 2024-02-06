package com.example.demo.service;


import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);
    List<Employee> getEmployees();
    Employee getSingleEmployee(Long id);
    void deleteEmployee(Long id);
    Employee updateEmployee(Employee employee);
    List<Employee> getEmployeeByName(String name);

    List<Employee> getEmployeeByNameAndLocation(String name,String location);

    List<Employee> getEmployeeByKeyword(String name);

    List<Employee> getEmployeeByNameOrLocation(String name ,String location);
}
