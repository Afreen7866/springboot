package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getByAll(){
		return employeeService.getByAllEmployee();
	}
	
	@PostMapping("/saveEmployee")
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
		
	}
	
	@GetMapping("/getSecondHighestSalary")
	public Double getSecondHighestSalary(){
		// add this in any file
		System.out.println("trigger");
		return employeeService.findSecondHighestSalary();
		
	}
}
