package com.poc.CustomerMS.model;

import java.io.Serializable;
import java.sql.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="employeeModel")
public class CustomerModel implements Serializable{
	
	private static final long serialVersionUID = -3024392000857958326L;
	private Integer id; 
	private String name;
	private Long contactNo;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "CustomerModel [id=" + id + ", name=" + name + ",  contactNo=" + contactNo + ", address=" + address + "]";
	}
	

	
}
