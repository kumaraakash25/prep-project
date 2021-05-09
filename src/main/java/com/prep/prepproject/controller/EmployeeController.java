package com.prep.prepproject.controller;

import com.prep.prepproject.model.Employee;
import com.prep.prepproject.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity getEmployee(@RequestParam("id") Long id) {
        Optional<Employee> emp = employeeService.getEmployee(id);
        if (emp.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(emp.get());
    }

    @PutMapping
    public ResponseEntity<Employee> update(@RequestBody Employee employeeDto) {
        Optional<Employee> emp = employeeService.updateEmployee(employeeDto);
        return ResponseEntity.ok().body(emp.get());
    }

    @PostMapping
    public ResponseEntity<Employee> post(@RequestBody Employee employeeDto) {
        Optional<Employee> emp = employeeService.createEmployee(employeeDto);
        return ResponseEntity.ok().body(emp.get());
    }
}
