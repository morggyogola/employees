package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImplementation implements  EmployeeService{

    private static List <Employee> list=new ArrayList<>();
    static {
        Employee e =new Employee();
        e.setName("Philip");
        e.setAge(20);
        e.setDepartment("Backend");
        e.setEmail("philip@gmail.com");
        e.setLocation("Baghdad");
        list.add(e);


    }
    @Override
    public List<Employee> getEmployees() {
        return list;
    }
}
