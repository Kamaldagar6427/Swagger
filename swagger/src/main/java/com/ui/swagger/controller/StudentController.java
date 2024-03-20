package com.ui.swagger.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Operation(tags = "getAllStudentsApi",
			description = "getAllStudentsApi Demo App",
			responses = {
					@ApiResponse(responseCode = "200",
							description = "Success"
							),
					@ApiResponse(responseCode = "500",
					        description = "Internal Error"
							),
			}
			)
	@GetMapping("/all")
	public String getAllStudents() {
		return "All Students..";
	}
	
	@GetMapping("/single")
	public String getStudent() {
		return "Single Student..";
	}
	
	@PostMapping("/register")
	public String registerStudent() {
		return "Student Regesterd..";
	}
	
	@PutMapping("/update")
	public String updateStudent() {
		return "Student Updated..";
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent() {
		return "Student Data Deleted..";
	}
	
	@Hidden
	@DeleteMapping("/deleteall")
	public String deleteAll() {
		return "All Student's Data Deleted..";
	}
}
