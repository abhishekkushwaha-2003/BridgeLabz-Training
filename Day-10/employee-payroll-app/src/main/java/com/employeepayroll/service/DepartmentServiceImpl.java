package com.employeepayroll.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employeepayroll.model.Department;
import com.employeepayroll.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<>();
        departmentRepository.findAll().forEach(departments::add);
        return departments;
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {

        Department existingDepartment =
                departmentRepository.findById(id).orElse(null);

        if (existingDepartment != null) {

            existingDepartment.setName(department.getName());
            existingDepartment.setDescription(department.getDescription());

            return departmentRepository.save(existingDepartment);
        }

        return null;
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}