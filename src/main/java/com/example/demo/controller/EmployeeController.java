package com.example.demo.controller;


import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired

    private EmployeeService eService;
    @PutMapping("/employees/{id}")
    public  ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        employee.setId(id);
        return new ResponseEntity<Employee>(eService.updateEmployee(employee),HttpStatus.OK) ;
    }
   @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees(){
        return new ResponseEntity<List<Employee>>(eService.getEmployees(), HttpStatus.OK);
    }
    //localhost:8081/employees/{id}
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
     return new ResponseEntity<Employee>( eService.getSingleEmployee(id),HttpStatus.CREATED);
    }
    @PostMapping("/employees")
    public ResponseEntity<Employee>  saveEmployee(@Valid
                                     @RequestBody Employee employees){
       return new ResponseEntity<Employee>(eService.addEmployee(employees),HttpStatus.OK);

    }
    //localhost:8081/employees?id=34
    @DeleteMapping("/employees")
    public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam Long id){
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/employees/filterByName")
    public ResponseEntity <List<Employee>> getEmployeeByName(@RequestParam String name){
        return new ResponseEntity<List<Employee>>(eService.getEmployeeByName(name),HttpStatus.OK);
    }
    @GetMapping("/employees/filterByNameAndLocation")
    public ResponseEntity<List <Employee>> getEmployeeByNameAndLocation(@RequestParam String name, @RequestParam String location){
        return new ResponseEntity<List<Employee>>(eService.getEmployeeByNameAndLocation(name,location),HttpStatus.OK);
    }
    @GetMapping("/employees/filterByKeyword")
    public ResponseEntity<List <Employee>> getEmployeeByKeyword(@RequestParam String name){
        return new ResponseEntity<List<Employee>>(eService.getEmployeeByKeyword(name),HttpStatus.OK);
    }

    @GetMapping("/employees/{name}/{location}")
    public ResponseEntity<List <Employee>> getEmployeeByNameOrLocation(@PathVariable  String name, @PathVariable String location){
        return new ResponseEntity<List<Employee>>(eService.getEmployeeByNameOrLocation(name,location),HttpStatus.OK);
    }
    @DeleteMapping("employees/delete/{name}")
    public ResponseEntity<String> deleteEmployeeByName(@PathVariable  String name){
        return new ResponseEntity<String>(eService.deleteEmployeeByName(name)+"No of employees deleted",HttpStatus.OK);
    }
}
