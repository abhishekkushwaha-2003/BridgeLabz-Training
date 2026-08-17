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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger logger =
	        LoggerFactory.getLogger(EmployeeServiceImpl.class);

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
    	
    	logger.info("Creating employee with email: {}", request.getEmail());

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
        
        logger.info("Employee created successfully with id: {}",
                savedEmployee.getId());

        return employeeMapper.toResponse(savedEmployee);
    }


 // GET ALL

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponse> getAllEmployees() {

        logger.info("Fetching all employees");

        List<EmployeeResponse> employees =
                employeeRepository.findAll()
                        .stream()
                        .map(employeeMapper::toResponse)
                        .toList();

        logger.info("Total employees fetched: {}", employees.size());

        return employees;
    }


    // GET BY ID

    @Override
    @Transactional(readOnly = true)
    public EmployeeResponse getEmployeeById(Long id) {
    	
    	logger.info("Fetching employee with id: {}", id);

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
    	
    	 logger.info("Updating employee with id: {}", id);

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
        
        logger.info("Employee updated successfully with id: {}", id);

        return employeeMapper.toResponse(updatedEmployee);
    }
    
    
    @Override
    public EmployeeResponse patchEmployee(
            Long id,
            EmployeePatchRequest request) {
    	
    	 logger.info("Partially updating employee with id: {}", id);

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
    	
    	 logger.info("Deleting employee with id: {}", id);

        Employee employee =
                employeeRepository.findById(id)
                .orElseThrow(() ->
                    new EmployeeNotFoundException(
                        "Employee not found with id: " + id));

        employeeRepository.delete(employee);
        
        logger.info("Employee deleted successfully with id: {}", id);
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