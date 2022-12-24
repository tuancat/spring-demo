package com.sam.springwebflux.controller;

import com.sam.springwebflux.model.Employee;
import com.sam.springwebflux.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employService;
    @GetMapping("/employees")
    public Flux<Employee> getAllEmployee() {
        return employService.findAll();
    }
}
