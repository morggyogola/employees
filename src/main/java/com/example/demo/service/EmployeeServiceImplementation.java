package com.example.demo.service;
import com.example.demo.model.Employee;

import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
 class EmployeeServiceImplementation implements  EmployeeService{

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

    @Override
    public Employee getSingleEmployee(Long id) {
        Optional<Employee> employee= eRepository.findById(id);
        if (employee.isPresent()){
            return employee.get();
        }
        throw new RuntimeException("Employee not found for the id "+id);
    }

    @Override
    public void deleteEmployee(Long id) {
        eRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return eRepository.save(employee);
    }
}
