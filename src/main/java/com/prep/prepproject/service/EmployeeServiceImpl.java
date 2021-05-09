package com.prep.prepproject.service;

import com.prep.prepproject.repository.EmployeeRepository;
import com.prep.prepproject.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(Long id) {
        return employeeRepository.findById(id);
    }

    public Optional<Employee> updateEmployee(Employee employee) {
        return Optional.of(employeeRepository.save(employee));
    }

    public Optional<Employee> createEmployee(Employee employee) {
        return Optional.of(employeeRepository.save(employee));
    }
}
