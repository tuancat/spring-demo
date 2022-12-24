package com.sam.springwebflux.service;

import com.sam.springwebflux.model.Employee;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public Flux<Employee> findAll() {
        return Flux.just(new Employee("E001", "Tuan Cat"), new Employee("E002", "Teo"));
    }
}
