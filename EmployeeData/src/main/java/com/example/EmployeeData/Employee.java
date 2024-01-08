package com.example.EmployeeData;

public class Employee {

	int id;
	String name;
	String state;
	String location;
	double salary;
	
	
	public Employee(int id, String name, String state, String location, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.location = location;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", state=" + state + ", location=" + location + ", salary="
				+ salary + "]";
	}
	
	
}
