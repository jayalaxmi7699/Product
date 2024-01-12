package com.demo.Employee.Entity;

import java.util.List;

import com.demo.Employee.Utility.Address;

public class Employee {
	
	private int empid;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private List<Address> address1;
	
//	public List<Address> getAddress() {
//		return address;
//	}
	public void setAddress(List<Address> address) {
		this.address1 = address;
	}
	public List<Address> getaddress(){
		return address1;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
