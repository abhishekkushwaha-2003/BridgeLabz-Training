package com.employeepayroll.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeepayroll.dto.request.EmployeeRequest;
import com.employeepayroll.dto.request.EmployeeSearchRequest;
import com.employeepayroll.dto.response.EmployeeResponse;
import com.employeepayroll.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // CREATE EMPLOYEE

    @PostMapping
    public ResponseEntity<EmployeeResponse> createEmployee(
            @Valid @RequestBody EmployeeRequest request) {

        EmployeeResponse response =
                employeeService.createEmployee(request);

        return new ResponseEntity<>(
                response,
                HttpStatus.CREATED);
    }


    // GET ALL EMPLOYEES

    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {

        List<EmployeeResponse> employees =
                employeeService.getAllEmployees();

        return ResponseEntity.ok(employees);
    }


    // GET EMPLOYEE BY ID

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(
            @PathVariable Long id) {

        EmployeeResponse response =
                employeeService.getEmployeeById(id);

        return ResponseEntity.ok(response);
    }


    // UPDATE EMPLOYEE

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponse> updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeRequest request) {

        EmployeeResponse response =
                employeeService.updateEmployee(id, request);

        return ResponseEntity.ok(response);
    }


    // DELETE EMPLOYEE

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(
            @PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }


    // PAGINATION + SORTING

    @GetMapping("/page")
    public ResponseEntity<Page<EmployeeResponse>> getEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        Page<EmployeeResponse> employees =
                employeeService.getEmployees(
                        page,
                        size,
                        sortBy,
                        direction);

        return ResponseEntity.ok(employees);
    }


    // QUERY BY EXAMPLE

    @PostMapping("/search")
    public ResponseEntity<Page<EmployeeResponse>> searchEmployees(
            @RequestBody EmployeeSearchRequest request,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        Page<EmployeeResponse> employees =
                employeeService.searchEmployees(
                        request,
                        page,
                        size,
                        sortBy,
                        direction);

        return ResponseEntity.ok(employees);
    }
    
    @GetMapping("/salary/greater-than")
    public ResponseEntity<List<EmployeeResponse>>
            getEmployeesWithSalaryGreaterThan(
                    @RequestParam BigDecimal salary) {

        List<EmployeeResponse> employees =
                employeeService
                        .getEmployeesWithSalaryGreaterThan(salary);

        return ResponseEntity.ok(employees);
    }
}