package com.example.EmployeeData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empservice;
	@GetMapping("/getAll")
	public List<Employee> allemp(){
		return empservice.getAllEmp();
	}
	
}
