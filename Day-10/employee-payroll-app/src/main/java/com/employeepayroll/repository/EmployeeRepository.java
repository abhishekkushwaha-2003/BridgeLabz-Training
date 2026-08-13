package com.employeepayroll.repository;

import org.springframework.data.repository.CrudRepository;

import com.employeepayroll.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}