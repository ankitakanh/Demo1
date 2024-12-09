package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeServices;

@RestController
@RequestMapping("/org/emp")
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	EmployeeServices employeeservices;
	
//	add employee
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeeservices.insertEmployee(emp);
	}
	
//	gett all emp
	@GetMapping
	public List<Employee> getAllData(){
		return employeeservices.getAllEmployee();
	}
	
//	 get emp by id 
	@GetMapping("/{id}")
	public Optional<Employee> getById(@PathVariable Long id) {
		return employeeservices.getByIdEmployee(id);
	}
	
//	update emp
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeservices.insertEmployee(emp);
	}
	
//	delete emp
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeservices.deleteEmployeeById(id);
		
		return "Employee Deleted Successfully";
	}
	
	
	
}
