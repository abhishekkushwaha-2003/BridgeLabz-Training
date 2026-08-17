package com.employeepayroll.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeepayroll.dto.request.EmployeePatchRequest;
import com.employeepayroll.dto.request.EmployeeRequest;
import com.employeepayroll.dto.request.EmployeeSearchRequest;
import com.employeepayroll.dto.response.EmployeeResponse;
import com.employeepayroll.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(
	    name = "Employee APIs",
	    description = "APIs for managing employees"
	)

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // CREATE EMPLOYEE

    @Operation(
    	    summary = "Create employee",
    	    description = "Creates a new employee"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "201",
    	        description = "Employee created successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "400",
    	        description = "Invalid employee data"
    	    ),
    	    @ApiResponse(
    	        responseCode = "404",
    	        description = "Department not found"
    	    )
    	})
    
    @PostMapping
    public ResponseEntity<EmployeeResponse> createEmployee(
            @Valid @RequestBody EmployeeRequest request) {

        EmployeeResponse response =
                employeeService.createEmployee(request);

        return new ResponseEntity<>(
                response,
                HttpStatus.CREATED);
    }


    // GET ALL EMPLOYEES
    
    @Operation(
    	    summary = "Get all employees",
    	    description = "Returns all employees"
    	)
    	@ApiResponse(
    	    responseCode = "200",
    	    description = "Employees retrieved successfully"
    	)

    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {

        List<EmployeeResponse> employees =
                employeeService.getAllEmployees();

        return ResponseEntity.ok(employees);
    }


    // GET EMPLOYEE BY ID
    
    @Operation(
    	    summary = "Get employee by ID",
    	    description = "Returns an employee using employee ID"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "200",
    	        description = "Employee found"
    	    ),
    	    @ApiResponse(
    	        responseCode = "404",
    	        description = "Employee not found"
    	    )
    	})

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(
            @PathVariable Long id) {

        EmployeeResponse response =
                employeeService.getEmployeeById(id);

        return ResponseEntity.ok(response);
    }


    // UPDATE EMPLOYEE
    
    @Operation(
    	    summary = "Update employee",
    	    description = "Updates all employee details"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "200",
    	        description = "Employee updated successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "400",
    	        description = "Invalid employee data"
    	    ),
    	    @ApiResponse(
    	        responseCode = "404",
    	        description = "Employee or department not found"
    	    )
    	})

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponse> updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeRequest request) {

        EmployeeResponse response =
                employeeService.updateEmployee(id, request);

        return ResponseEntity.ok(response);
    }
    
    @Operation(
    	    summary = "Partially update employee",
    	    description = "Updates only the fields provided in the request"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "200",
    	        description = "Employee partially updated successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "400",
    	        description = "Invalid data"
    	    ),
    	    @ApiResponse(
    	        responseCode = "404",
    	        description = "Employee or department not found"
    	    )
    	})
    
    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeResponse> patchEmployee(
            @PathVariable Long id,
            @Valid @RequestBody EmployeePatchRequest request) {

        EmployeeResponse response =
                employeeService.patchEmployee(id, request);

        return ResponseEntity.ok(response);
    }

    
    @Operation(
    	    summary = "Delete employee",
    	    description = "Deletes an employee using employee ID"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "204",
    	        description = "Employee deleted successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "404",
    	        description = "Employee not found"
    	    )
    	})

    // DELETE EMPLOYEE

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(
            @PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }


    // PAGINATION + SORTING
    
    @Operation(
    	    summary = "Get employees with pagination and sorting",
    	    description = "Returns employees using pagination and sorting"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "200",
    	        description = "Employees retrieved successfully"
    	    )
    	})

    @GetMapping("/page")
    public ResponseEntity<Page<EmployeeResponse>> getEmployees(
    		@Parameter(description = "Page number, starting from 0")
    		@RequestParam(defaultValue = "0") int page,

    		@Parameter(description = "Number of employees per page")
    		@RequestParam(defaultValue = "5") int size,

    		@Parameter(description = "Field used for sorting")
    		@RequestParam(defaultValue = "id") String sortBy,

    		@Parameter(description = "Sorting direction: asc or desc")
    		@RequestParam(defaultValue = "asc") String direction) {

        Page<EmployeeResponse> employees =
                employeeService.getEmployees(
                        page,
                        size,
                        sortBy,
                        direction);

        return ResponseEntity.ok(employees);
    }


    // QUERY BY EXAMPLE
    
    @Operation(
    	    summary = "Search employees using Query By Example",
    	    description = "Searches employees using the provided fields with pagination and sorting"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "200",
    	        description = "Employees found successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "400",
    	        description = "Invalid search criteria"
    	    )
    	})

    @PostMapping("/search")
    public ResponseEntity<Page<EmployeeResponse>> searchEmployees(
    		@RequestBody EmployeeSearchRequest request,
    		
    		@Parameter(description = "Page number, starting from 0")
    		@RequestParam(defaultValue = "0") int page,

    		@Parameter(description = "Number of employees per page")
    		@RequestParam(defaultValue = "5") int size,

    		@Parameter(description = "Field used for sorting")
    		@RequestParam(defaultValue = "id") String sortBy,

    		@Parameter(description = "Sorting direction: asc or desc")
    		@RequestParam(defaultValue = "asc") String direction) {

        Page<EmployeeResponse> employees =
                employeeService.searchEmployees(
                        request,
                        page,
                        size,
                        sortBy,
                        direction);

        return ResponseEntity.ok(employees);
    }
    
    @Operation(
    	    summary = "Find employees with salary greater than given amount",
    	    description = "Returns employees whose salary is greater than the specified salary"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "200",
    	        description = "Employees found successfully"
    	    )
    	})
    
    @GetMapping("/salary/greater-than")
    public ResponseEntity<List<EmployeeResponse>>
            getEmployeesWithSalaryGreaterThan(
                    @RequestParam BigDecimal salary) {

        List<EmployeeResponse> employees =
                employeeService
                        .getEmployeesWithSalaryGreaterThan(salary);

        return ResponseEntity.ok(employees);
    }
}