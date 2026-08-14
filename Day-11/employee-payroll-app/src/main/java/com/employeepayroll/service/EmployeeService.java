package com.employeepayroll.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;

import com.employeepayroll.dto.request.EmployeeRequest;
import com.employeepayroll.dto.request.EmployeeSearchRequest;
import com.employeepayroll.dto.response.EmployeeResponse;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest request);

    List<EmployeeResponse> getAllEmployees();

    EmployeeResponse getEmployeeById(Long id);

    EmployeeResponse updateEmployee(
            Long id,
            EmployeeRequest request);

    void deleteEmployee(Long id);

    Page<EmployeeResponse> getEmployees(
            int page,
            int size,
            String sortBy,
            String direction);

    Page<EmployeeResponse> searchEmployees(
            EmployeeSearchRequest request,
            int page,
            int size,
            String sortBy,
            String direction);
    
    List<EmployeeResponse> getEmployeesWithSalaryGreaterThan(
            BigDecimal salary);
}