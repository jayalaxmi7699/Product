package com.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App2 
{
	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(131, "John"));
		list.add(new Employee(102, "Jenny"));
		list.add(new Employee(104, "Mercy"));
		list.add(new Employee(111, "Monisha"));
		list.add(new Employee(122, "Maya"));
		list.add(new Employee(101, "Sam"));
		list.add(new Employee(133, "John"));
		list.add(new Employee(105, "Jenny"));
		list.add(new Employee(107, "Mercy"));

		//forEach()- terminal, consumer
		list.stream().forEach(e->System.out.println(e));

		//map- intermediate, Function , stateless operation
		List<String> names= list.stream()
				.map(e->e.getName())
				.collect(Collectors.toList());
		System.out.println(names);

		//filter- intermediate, Predicate,  stateless operation
		List<Integer> ids= list.stream()
				.filter(e->e.getName().startsWith("M"))
				.map(e->e.getId())
				.collect(Collectors.toList());
		System.out.println(ids);

		//sort- intermediate, stateful operation-skip, limit, distinct and sorted
		list.stream().sorted(new EmployeeComparator())
		.forEach(e->System.out.println(e));

		//limit
		System.out.println("Using Limit- ");
		list.stream().limit(2).forEach(e->System.out.println(e));

		//flatMap
		List<String> names1=new ArrayList<>();
		names1.add("Snehal");names1.add("John");

		List<String>names2=new ArrayList<>();
		names2.add("Neha");names2.add("Jenny");	

		List<List<String>> allNames=Arrays.asList(names1, names2);


		List<String> allNamesStream= allNames.stream()
				.flatMap(n->n.stream()).filter(name->name.contains("J"))
				.peek(name->
				{
					name=name+" Hi ";
					System.out.println("Name Starting with 'J'"+name);
				})
				.collect(Collectors.toList());
		System.out.println(allNamesStream);

		//peek- intermediate operation, consumer
		List<Integer> ids2= list.stream()
				.filter(e->e.getName().startsWith("M")) //employees names starting 'M'
				.map(e->e.getId()*10) //collecting only IDs * 10 //give to peek()
				.peek(id->System.out.println(id*100)) //
				.collect(Collectors.toList());
		System.out.println(ids2);

		//count- terminal
		int count = (int) list.stream()
				.filter(e->e.getName().startsWith("M"))
				.map(e->e.getId()*10)
				.peek(id->System.out.println(id)).count();
		System.out.println("Count is "+count);

		//reduce
		List<String> strings = Arrays.asList("Welcome"," ","to"," " ,"India");
		String combineString= strings.stream().reduce("**", (subString,str)->subString+str);

		System.out.println(combineString);
		//reduce
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int addition= num.stream().reduce(0, (a,b)->a+b);
		System.out.println("Addition is "+addition);

		//max- terminal operation
		Optional<Integer> max = num.stream().max((i1,i2)->(i1-i2));
		System.out.println(max.get());

		//min- terminal operation
		Optional<Integer> min = num.stream().min((i1,i2)->(i1-i2));
		System.out.println(min.get());

		//findFirst- guarantees first element
		Optional<Integer> firstEven = num.parallelStream().filter(n->(n%2==0)).findFirst();
		System.out.println("First even is "+firstEven.get());

		//findAny-with sequential stream, it is most likely, first element, but no guarantees for this
		Optional<Integer> anyEven = num.parallelStream().filter(n->(n%2==0)).findAny();
		System.out.println("Any even is "+anyEven.get());

		//isParallel()
		Stream<String> cities= Stream.of("Pune", "Chennai", "Banglore","Hyderabad");
		System.out.println("Before parallel() - "+cities.isParallel());
		cities = cities.parallel();
		System.out.println("After parallel() - "+cities.isParallel());
		//cities.sequential();

		//group By
		Map<String, List<Employee>> empByName= new HashMap<>();

		//		for(Employee e : list)			
		//		{
		//			if(!empByName.containsKey(e.getName()))
		//			{
		//				empByName.put(e.getName(), new ArrayList<>());
		//			}
		//			empByName.get(e.getName()).add(e);			
		//		}
		//		System.out.println("Before GroupBy Stream - \n"+empByName);

		empByName = list.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(empByName);

	}
}
