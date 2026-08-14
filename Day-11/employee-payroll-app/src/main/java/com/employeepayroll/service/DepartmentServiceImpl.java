package com.employeepayroll.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeepayroll.dto.request.DepartmentRequest;
import com.employeepayroll.dto.response.DepartmentResponse;
import com.employeepayroll.entity.Department;
import com.employeepayroll.exception.DepartmentNotFoundException;
import com.employeepayroll.mapper.DepartmentMapper;
import com.employeepayroll.repository.DepartmentRepository;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    public DepartmentServiceImpl(
            DepartmentRepository departmentRepository,
            DepartmentMapper departmentMapper) {

        this.departmentRepository = departmentRepository;
        this.departmentMapper = departmentMapper;
    }

    @Override
    public DepartmentResponse createDepartment(
            DepartmentRequest request) {

        Department department =
                departmentMapper.toEntity(request);

        Department savedDepartment =
                departmentRepository.save(department);

        return departmentMapper.toResponse(savedDepartment);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DepartmentResponse> getAllDepartments() {

        return departmentRepository.findAll()
                .stream()
                .map(departmentMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public DepartmentResponse getDepartmentById(Long id) {

        Department department =
                departmentRepository.findById(id)
                .orElseThrow(() ->
                    new DepartmentNotFoundException(
                        "Department not found with id: " + id));

        return departmentMapper.toResponse(department);
    }

    @Override
    public DepartmentResponse updateDepartment(
            Long id,
            DepartmentRequest request) {

        Department existingDepartment =
                departmentRepository.findById(id)
                .orElseThrow(() ->
                    new DepartmentNotFoundException(
                        "Department not found with id: " + id));

        existingDepartment.setName(request.getName());
        existingDepartment.setDescription(request.getDescription());

        Department updatedDepartment =
                departmentRepository.save(existingDepartment);

        return departmentMapper.toResponse(updatedDepartment);
    }

    @Override
    public void deleteDepartment(Long id) {

        Department department =
                departmentRepository.findById(id)
                .orElseThrow(() ->
                    new DepartmentNotFoundException(
                        "Department not found with id: " + id));

        departmentRepository.delete(department);
    }
}