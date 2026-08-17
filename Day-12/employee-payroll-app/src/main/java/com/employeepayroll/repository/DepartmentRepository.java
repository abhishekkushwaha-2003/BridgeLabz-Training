package com.employeepayroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeepayroll.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}