package com.reddit.clone.service;

import com.reddit.clone.model.Employee;
import com.reddit.clone.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee addNewEmployee (Employee employeeToBeAddedIntoDb) {
        
    }
}