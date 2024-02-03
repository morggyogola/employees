package com.example.demo.controller;


import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired

    private EmployeeService eService;
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        employee.setId(id);
        return  eService.updateEmployee(employee);
    }
   @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return  eService.getEmployees();
    }
    //localhost:8081/employees/{id}
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id){
     return eService.getSingleEmployee(id);
    }
    @PostMapping("/employees")
    public Employee saveEmployee(@Valid @RequestBody Employee employees){
       return eService.addEmployee(employees);

    }
    //localhost:8081/employees?id=34
    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestParam Long id){
        eService.deleteEmployee(id);
    }
}
