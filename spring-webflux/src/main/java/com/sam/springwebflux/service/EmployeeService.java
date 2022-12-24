package com.sam.springwebflux.service;

import com.sam.springwebflux.model.Employee;
import reactor.core.publisher.Flux;

public interface EmployeeService {
    Flux<Employee> findAll();
}
