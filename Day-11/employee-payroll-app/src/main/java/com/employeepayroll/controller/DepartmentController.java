package com.employeepayroll.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeepayroll.dto.request.DepartmentRequest;
import com.employeepayroll.dto.response.DepartmentResponse;
import com.employeepayroll.service.DepartmentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(
	    name = "Department APIs",
	    description = "APIs for managing departments"
	)

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    
    
    
    @Operation(
    	    summary = "Create department",
    	    description = "Creates a new department"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "201",
    	        description = "Department created successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "400",
    	        description = "Invalid department data"
    	    )
    	})

    @PostMapping
    public ResponseEntity<DepartmentResponse> createDepartment(
            @Valid @RequestBody DepartmentRequest request) {

        DepartmentResponse response =
                departmentService.createDepartment(request);

        return new ResponseEntity<>(
                response,
                HttpStatus.CREATED);
    }

    @Operation(
    	    summary = "Get all departments",
    	    description = "Returns all departments"
    	)
    	@ApiResponse(
    	    responseCode = "200",
    	    description = "Departments retrieved successfully"
    	)
    
    @GetMapping
    public ResponseEntity<List<DepartmentResponse>> getAllDepartments() {

        List<DepartmentResponse> departments =
                departmentService.getAllDepartments();

        return ResponseEntity.ok(departments);
    }
    
    
    @Operation(
    	    summary = "Get department by ID",
    	    description = "Returns a department using its ID"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "200",
    	        description = "Department found successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "404",
    	        description = "Department not found"
    	    )
    	})

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentResponse> getDepartmentById(
            @PathVariable Long id) {

        DepartmentResponse response =
                departmentService.getDepartmentById(id);

        return ResponseEntity.ok(response);
    }

    @Operation(
    	    summary = "Get department by ID",
    	    description = "Returns a department using its ID"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "200",
    	        description = "Department found successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "404",
    	        description = "Department not found"
    	    )
    	})
    
    @PutMapping("/{id}")
    public ResponseEntity<DepartmentResponse> updateDepartment(
            @PathVariable Long id,
            @Valid @RequestBody DepartmentRequest request) {

        DepartmentResponse response =
                departmentService.updateDepartment(id, request);

        return ResponseEntity.ok(response);
    }
    
    @Operation(
    	    summary = "Delete department",
    	    description = "Deletes a department using its ID"
    	)
    	@ApiResponses({
    	    @ApiResponse(
    	        responseCode = "204",
    	        description = "Department deleted successfully"
    	    ),
    	    @ApiResponse(
    	        responseCode = "404",
    	        description = "Department not found"
    	    )
    	})

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(
            @PathVariable Long id) {

        departmentService.deleteDepartment(id);

        return ResponseEntity.noContent().build();
    }
}