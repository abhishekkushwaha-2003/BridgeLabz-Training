package com.employeepayroll.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table("DEPARTMENT")
public class Department {

    @Id
    private Long id;

    private String name;
    private String description;
}