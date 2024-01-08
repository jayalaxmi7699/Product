package com.example.EmployeeData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Override
	public List<Employee> getAllEmp() {
		List<Employee> emplist = new ArrayList<Employee>();

		Employee emplist1 = new Employee(1, "Jaya", "Andhra", "Vizag", 5);
		Employee emplist2 = new Employee(2, "Anu", "U.P", "Plant", 9);
		Employee emplist3 = new Employee(3, "Anu", "Telangana", "NAD", 7);
		Employee emplist4 = new Employee(4, "Priya", "U.P", "SriNagar", 4);

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emplist1);
		list.add(emplist2);
		list.add(emplist3);
		list.add(emplist4);

//	for (Employee employee : list) {
//		System.out.println(employee);
//	}
	list.stream().map(Employee::getName).distinct().forEach(System.out::println);
	
	DoubleSummaryStatistics Sum =list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	System.out.println("sum : "+Sum.getSum());
	System.out.println("avg: "+Sum.getAverage());
	
	Optional<Employee> df =list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));	
	System.out.println(df);
	
	Map<String, Long> ms =list.stream().collect(Collectors.groupingBy(Employee::getLocation, Collectors.counting()));	
	System.out.println(ms);
	
	Map<String, Long> gf = list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
	List<String> gh = list.stream().filter(t->t.getSalary()>4).map(Employee::getName).collect(Collectors.toList());
	System.out.println(gh);
	Map<String, Long> gfg = list.stream().filter(t->t.getSalary()>4).collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
	System.out.println("Salary "+gfg);
	Map<String, Long> deptname = list.stream().filter(b->b.getState()=="U.P").collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
	System.out.println(deptname);
	return list;
	}
}
