package com.poc.EmployeeMS.service;

import java.util.List;

import com.poc.CustomerMS.model.CustomerModel;

public interface EmployeeService {
	public String getEmployeeDetailByID(Integer id);

	public List<CustomerModel> getAllEmployeeDetails();

	public String addEmployee(CustomerModel employeeModel);

	public String updateEmployee(CustomerModel employeeModel);

	public int deleteEmployeeDetail(Integer id);
}
