package com.demo.Employee.Utility;

import java.util.ArrayList;
import java.util.List;

import com.demo.Employee.Entity.Employee;

public class EmployeeUtility {
	public ArrayList<Employee> list=new ArrayList();
	public static String UpperCaseString(String str) {
		String UpperCaseString=str.toUpperCase();
		return UpperCaseString;
	}
	public static List<Employee> getAllEmployees(){
		Employee employee1=new Employee();
		employee1.setEmpid(1);
		employee1.setFirstName("jaya");
		employee1.setLastName("paila");
		employee1.setEmail("jaya@gmail.com");
		employee1.setGender("female");
		
		List<Employee> list=new ArrayList<>();
	     List<Address> addlist=new ArrayList();
	     Address add1=new Address();
	     add1.setFirstName("jaya");
	     add1.setLastName("paila");
	     add1.setLocation("hyd");
		
	     Address add2=new Address();
	     add2.setFirstName("laxmi");
	     add2.setLastName("paila");
//	     add2.setLocation("pune");
	     
	     addlist.add(add1);
	     addlist.add(add2);
	     employee1.setAddress(addlist);
	     
	     
		Employee employee2=new Employee();
		employee2.setEmpid(2);
		employee2.setFirstName("sri");
		employee2.setLastName("pilla");
		employee2.setEmail("sri@gmail.com");
		employee2.setGender("female");
		
		Employee employee3=new Employee();
		employee3.setEmpid(3);
		employee3.setFirstName("abhi");
		employee3.setLastName("reddy");
		employee3.setEmail("abhi@gmail.com");
		employee3.setGender("male");
		
		Employee employee4=new Employee();
		employee4.setEmpid(4);
		employee4.setFirstName("karthik");
		employee4.setLastName("miya");
		employee4.setEmail("karthik@gmail.com");
		employee4.setGender("male");
		
		List<Address> addlist1=new ArrayList();
	     Address add3=new Address();
	     add3.setFirstName("jaya");
	     add3.setLastName("paila");
//	     add3.setLocation("hyd");
		
	     Address add4=new Address();
	     add4.setFirstName("laxmi");
	     add4.setLastName("paila");
	     add4.setLocation("Mumbai");
	     
	     addlist1.add(add3);
	     addlist1.add(add4);
	     
	     employee4.setAddress(addlist1);
		
		Employee employee5=new Employee();
		employee5.setEmpid(5);
		employee5.setFirstName("ananya");
		employee5.setLastName("reddy");
		employee5.setEmail("ananya@gmail.com");
		employee5.setGender("female");
		
    	ArrayList<Employee> emp=new ArrayList<>();
    	emp.add(employee1);
    	emp.add(employee2);
    	emp.add(employee3);
    	emp.add(employee4);
    	emp.add(employee5);
    	return emp;
	} 
}

