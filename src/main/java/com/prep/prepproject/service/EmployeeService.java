package com.prep.prepproject.service;

import com.prep.prepproject.model.Employee;

import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> getEmployee(Long id);

    Optional<Employee> updateEmployee(Employee employee);

    Optional<Employee> createEmployee(Employee employee);
}
