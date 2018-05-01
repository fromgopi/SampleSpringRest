package com.example.SimpleSpringBoot.dao;

import com.example.SimpleSpringBoot.beans.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    List<Employee> findByFirstName(String firstName);


}
