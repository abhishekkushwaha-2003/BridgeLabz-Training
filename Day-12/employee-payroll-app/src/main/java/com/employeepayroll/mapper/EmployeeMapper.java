package com.employeepayroll.mapper;

import org.springframework.stereotype.Component;

import com.employeepayroll.dto.request.EmployeeRequest;
import com.employeepayroll.dto.response.EmployeeResponse;
import com.employeepayroll.entity.Employee;

@Component
public class EmployeeMapper {

    public Employee toEntity(EmployeeRequest request) {

        Employee employee = new Employee();

        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setPhone(request.getPhone());
        employee.setSalary(request.getSalary());

        return employee;
    }

    public EmployeeResponse toResponse(Employee employee) {

        EmployeeResponse response = new EmployeeResponse();

        response.setId(employee.getId());
        response.setName(employee.getName());
        response.setEmail(employee.getEmail());
        response.setPhone(employee.getPhone());
        response.setSalary(employee.getSalary());

        if (employee.getDepartment() != null) {
            response.setDepartmentId(
                    employee.getDepartment().getId());
        }

        return response;
    }
}