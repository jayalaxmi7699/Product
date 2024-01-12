package com.poc.EmployeeMS.service.impl;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.poc.CustomerMS.model.CustomerModel;
import com.poc.EmployeeMS.dao.EmployeeDao;
import com.poc.EmployeeMS.service.EmployeeService;

@ManagedBean(name = "employeeService")
@RequestScoped
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public String getEmployeeDetailByID(Integer id) {
		CustomerModel employeeDetailByID = employeeDao.getEmployeeDetailByID(id);
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("updateModel", employeeDetailByID);
		return "UpdateEmployee.xhtml";
	}

	@Override
	public List<CustomerModel> getAllEmployeeDetails() {
		return employeeDao.getAllEmployeeDetails();
	}

	@Override
	public String addEmployee(CustomerModel employeeModel) {
		 
		int i = employeeDao.addEmployee(employeeModel);
		 
		 return "AllEmployeeDetails";
	}

	@Override
	public String updateEmployee(CustomerModel employeeModel) {
	 int z=employeeDao.updateEmployee(employeeModel);
	 return "AllEmployeeDetails";
	}

	@Override
	public int deleteEmployeeDetail(Integer id) {
		
		return employeeDao.deleteEmployeeDetail(id);
		}
	
}
