package com.employeepayroll.dto.request;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeSearchRequest {

    private String name;
    private String email;
    private String phone;
    private BigDecimal salary;
    private Long departmentId;
}