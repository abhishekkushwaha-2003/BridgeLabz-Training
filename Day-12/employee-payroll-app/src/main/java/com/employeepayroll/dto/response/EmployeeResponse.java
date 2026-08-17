package com.employeepayroll.dto.response;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private BigDecimal salary;
    private Long departmentId;
}