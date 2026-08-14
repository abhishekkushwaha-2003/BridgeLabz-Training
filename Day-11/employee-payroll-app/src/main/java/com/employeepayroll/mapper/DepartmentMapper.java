package com.employeepayroll.mapper;

import org.springframework.stereotype.Component;

import com.employeepayroll.dto.request.DepartmentRequest;
import com.employeepayroll.dto.response.DepartmentResponse;
import com.employeepayroll.entity.Department;

@Component
public class DepartmentMapper {

    public Department toEntity(DepartmentRequest request) {

        Department department = new Department();

        department.setName(request.getName());
        department.setDescription(request.getDescription());

        return department;
    }

    public DepartmentResponse toResponse(Department department) {

        DepartmentResponse response = new DepartmentResponse();

        response.setId(department.getId());
        response.setName(department.getName());
        response.setDescription(department.getDescription());

        return response;
    }
}