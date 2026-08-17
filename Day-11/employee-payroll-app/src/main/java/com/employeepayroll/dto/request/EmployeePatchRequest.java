package com.employeepayroll.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeePatchRequest {

    @Size(min = 2, max = 50)
    private String name;

    @Email
    private String email;

    @Pattern(regexp = "^[0-9]{10}$")
    private String phone;

    @Positive
    private BigDecimal salary;

    @Positive
    private Long departmentId;
}