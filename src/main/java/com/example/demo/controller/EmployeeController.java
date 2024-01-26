package com.example.demo.controller;


import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired

    private EmployeeService eService;
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        System.out.println("updating employee data for the id"+id);
        return  employee;
    }
   @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return  eService.getEmployees();
    }
    //localhost:8081/employees/{id}
    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id){
     return "Fetching the employee details for the id "+id;
    }
    @PostMapping("/employees")
    public  String saveEmployee(@RequestBody Employee employees){
       return  "saving employee details to the database"+employees;
    }
    //localhost:8081/employees?id=34
    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam Long id){
       return "Deleting the employee details for the id"+id;
    }
}