package com.employeepayroll.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeepayroll.dto.request.EmployeePatchRequest;
import com.employeepayroll.dto.request.EmployeeRequest;
import com.employeepayroll.dto.request.EmployeeSearchRequest;
import com.employeepayroll.dto.response.EmployeeResponse;
import com.employeepayroll.entity.Department;
import com.employeepayroll.entity.Employee;
import com.employeepayroll.exception.DepartmentNotFoundException;
import com.employeepayroll.exception.EmployeeNotFoundException;
import com.employeepayroll.mapper.EmployeeMapper;
import com.employeepayroll.repository.DepartmentRepository;
import com.employeepayroll.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(
            EmployeeRepository employeeRepository,
            DepartmentRepository departmentRepository,
            EmployeeMapper employeeMapper) {

        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.employeeMapper = employeeMapper;
    }

    // CREATE

    @Override
    public EmployeeResponse createEmployee(
            EmployeeRequest request) {

        Department department =
                departmentRepository.findById(request.getDepartmentId())
                .orElseThrow(() ->
                    new DepartmentNotFoundException(
                        "Department not found with id: "
                        + request.getDepartmentId()));

        Employee employee =
                employeeMapper.toEntity(request);

        employee.setDepartment(department);

        Employee savedEmployee =
                employeeRepository.save(employee);

        return employeeMapper.toResponse(savedEmployee);
    }


    // GET ALL

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponse> getAllEmployees() {

        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper::toResponse)
                .toList();
    }


    // GET BY ID

    @Override
    @Transactional(readOnly = true)
    public EmployeeResponse getEmployeeById(Long id) {

        Employee employee =
                employeeRepository.findById(id)
                .orElseThrow(() ->
                    new EmployeeNotFoundException(
                        "Employee not found with id: " + id));

        return employeeMapper.toResponse(employee);
    }


    // UPDATE

    @Override
    public EmployeeResponse updateEmployee(
            Long id,
            EmployeeRequest request) {

        Employee existingEmployee =
                employeeRepository.findById(id)
                .orElseThrow(() ->
                    new EmployeeNotFoundException(
                        "Employee not found with id: " + id));

        Department department =
                departmentRepository.findById(request.getDepartmentId())
                .orElseThrow(() ->
                    new DepartmentNotFoundException(
                        "Department not found with id: "
                        + request.getDepartmentId()));

        existingEmployee.setName(request.getName());
        existingEmployee.setEmail(request.getEmail());
        existingEmployee.setPhone(request.getPhone());
        existingEmployee.setSalary(request.getSalary());
        existingEmployee.setDepartment(department);

        Employee updatedEmployee =
                employeeRepository.save(existingEmployee);

        return employeeMapper.toResponse(updatedEmployee);
    }
    
    
    @Override
    public EmployeeResponse patchEmployee(
            Long id,
            EmployeePatchRequest request) {

        Employee existingEmployee =
                employeeRepository.findById(id)
                .orElseThrow(() ->
                    new EmployeeNotFoundException(
                        "Employee not found with id: " + id));

        if (request.getName() != null) {
            existingEmployee.setName(request.getName());
        }

        if (request.getEmail() != null) {
            existingEmployee.setEmail(request.getEmail());
        }

        if (request.getPhone() != null) {
            existingEmployee.setPhone(request.getPhone());
        }

        if (request.getSalary() != null) {
            existingEmployee.setSalary(request.getSalary());
        }

        if (request.getDepartmentId() != null) {

            Department department =
                    departmentRepository.findById(
                            request.getDepartmentId())
                    .orElseThrow(() ->
                        new DepartmentNotFoundException(
                            "Department not found with id: "
                            + request.getDepartmentId()));

            existingEmployee.setDepartment(department);
        }

        Employee updatedEmployee =
                employeeRepository.save(existingEmployee);

        return employeeMapper.toResponse(updatedEmployee);
    }


    // DELETE

    @Override
    public void deleteEmployee(Long id) {

        Employee employee =
                employeeRepository.findById(id)
                .orElseThrow(() ->
                    new EmployeeNotFoundException(
                        "Employee not found with id: " + id));

        employeeRepository.delete(employee);
    }


    // PAGINATION + SORTING

    @Override
    @Transactional(readOnly = true)
    public Page<EmployeeResponse> getEmployees(
            int page,
            int size,
            String sortBy,
            String direction) {

        Sort sort;

        if (direction.equalsIgnoreCase("desc")) {

            sort = Sort.by(sortBy).descending();

        } else {

            sort = Sort.by(sortBy).ascending();
        }

        Pageable pageable =
                PageRequest.of(page, size, sort);

        return employeeRepository
                .findAll(pageable)
                .map(employeeMapper::toResponse);
    }


    // QUERY BY EXAMPLE

    @Override
    @Transactional(readOnly = true)
    public Page<EmployeeResponse> searchEmployees(
            EmployeeSearchRequest request,
            int page,
            int size,
            String sortBy,
            String direction) {

        Employee employee = new Employee();

        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setPhone(request.getPhone());
        employee.setSalary(request.getSalary());

        // Department filter
        if (request.getDepartmentId() != null) {

            Department department = new Department();
            department.setId(request.getDepartmentId());

            employee.setDepartment(department);
        }

        ExampleMatcher matcher =
                ExampleMatcher.matching()
                        .withIgnoreNullValues()
                        .withIgnoreCase()
                        .withStringMatcher(
                                ExampleMatcher.StringMatcher.CONTAINING);

        Example<Employee> example =
                Example.of(employee, matcher);

        Sort sort;

        if (direction.equalsIgnoreCase("desc")) {

            sort = Sort.by(sortBy).descending();

        } else {

            sort = Sort.by(sortBy).ascending();
        }

        Pageable pageable =
                PageRequest.of(page, size, sort);

        return employeeRepository
                .findAll(example, pageable)
                .map(employeeMapper::toResponse);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponse> getEmployeesWithSalaryGreaterThan(
            BigDecimal salary) {

        return employeeRepository
                .findEmployeesWithSalaryGreaterThan(salary)
                .stream()
                .map(employeeMapper::toResponse)
                .toList();
    }
}