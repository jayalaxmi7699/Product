package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeList2 {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// male and female emp
		Map<String, Long> ss = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Based on gender"+ss);
		// all dept names
		employeeList.stream().map(f -> f.getDepartment()).distinct().forEach(System.out::println);
		// avg age of male and female
		Map<String, Double> avg = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println("avg"+avg);
		// highest salary
		Optional<Employee> highestsal = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("highestsal"+highestsal);
		// emp joined after 2015//		
				employeeList.stream().filter(g -> g.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);
//				
		// count of emp in dept
		Map<String, Long> deptcount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("deptcount"+deptcount);
		// avg salary in each dept
		employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		// youngest male emp in dev dept
		Optional<Employee> youngestemp = employeeList.stream()
				.filter(w -> w.getGender() == "Male" && w.getDepartment() == "Product Development")
				.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		System.out.println("youngestemp"+youngestemp);
		// Who has the most working experience in the organization?
		Optional<Employee> mostWorkExp = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining))
				.findFirst();
		System.out.println("mostWorkExp"+mostWorkExp);
		// How many male and female employees are there in the sales and marketing team
		Map<String, Long> maleandfemale = employeeList.stream().filter(g -> g.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("maleandfemale"+maleandfemale);
		// What is the average salary of male and female employees
		Map<String, Double> MaleFemaleAvg = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("MaleFemaleAvg"+MaleFemaleAvg);
		// List down the names of all employees in each department
		Map<String, List<Employee>> allemp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("allemp"+allemp);
		//What is the average salary and total salary of the whole organization
		DoubleSummaryStatistics s=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("avgsalary "+s.getAverage());
		System.out.println("sum of salary "+s.getSum());
		System.out.println("count of "+s.getCount());
		//Separate the employees who are younger or equal to 25 years 
		List<Employee> younger= employeeList.stream().filter(d->d.getAge()<=25).collect(Collectors.toList());
		System.out.println("younger"+younger);
		//Who is the oldest employee in the organization? What is his age and which department he belongs to
	Optional<Employee> oldestEmp=	employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println(oldestEmp);
		Employee emp = oldestEmp.get();
		System.out.println(emp.getName());
		
		
		
		
	}
}
