package com.example.SimpleSpringBoot.controller;

import com.example.SimpleSpringBoot.beans.Employee;
import com.example.SimpleSpringBoot.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository emp;



    @RequestMapping("/employees")
    public List<Employee> getAll(){
        System.out.println("================ Inside Employee Controller. ==========================");
        return emp.findAll();
    }


    @RequestMapping("/employee/{name}")
    public List<Employee> getEmpDetail(@PathVariable("name") String name){
        return emp.findByFirstName(name);
    }

    @RequestMapping(method=RequestMethod.POST, value="/employee/add")
    public String save(@RequestBody Employee employee){
        System.out.println("================ Inside Employee Controller To add Method. ==========================");
        emp.save(employee);
        return employee.getId() + "";
    }

}
