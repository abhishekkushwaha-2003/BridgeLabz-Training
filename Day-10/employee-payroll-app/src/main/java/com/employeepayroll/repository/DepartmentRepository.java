package com.employeepayroll.repository;

import org.springframework.data.repository.CrudRepository;

import com.employeepayroll.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}