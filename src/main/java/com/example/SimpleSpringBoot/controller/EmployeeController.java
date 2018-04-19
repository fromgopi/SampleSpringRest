package com.example.SimpleSpringBoot.controller;

import com.example.SimpleSpringBoot.beans.Employee;
import com.example.SimpleSpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository emp;

    @RequestMapping("/employee")
    public List<Employee> getAll(){
        return emp.findAll();
    }

    @RequestMapping("/employee/{name}")
    public List<Employee> getEmpDetail(@PathVariable("name") String name){
        return emp.findByFirstName(name);
    }

}
