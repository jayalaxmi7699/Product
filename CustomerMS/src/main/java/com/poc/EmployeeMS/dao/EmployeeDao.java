package com.poc.EmployeeMS.dao;

import java.util.List;

import com.poc.CustomerMS.model.CustomerModel;

public interface EmployeeDao {
	public CustomerModel getEmployeeDetailByID(Integer id);

	public List<CustomerModel> getAllEmployeeDetails();

	public int addEmployee(CustomerModel employeeModel);

	public int updateEmployee(CustomerModel employeeModel);

	public int deleteEmployeeDetail(Integer id);
}
