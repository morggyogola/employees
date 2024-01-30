package com.example.demo.service;
import com.example.demo.model.Employee;

import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImplementation implements  EmployeeService{

   private final EmployeeRepository eRepository;
    @Autowired
    public EmployeeServiceImplementation(EmployeeRepository eRepository) {
        this.eRepository = eRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return eRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return  eRepository.findAll();
    }
}
