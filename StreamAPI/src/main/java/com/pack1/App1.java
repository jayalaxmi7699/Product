package com.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

//Stream Creation
public class App1 
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
		
		list.stream().forEach(e->System.out.println(e.getName()));
		
		Stream<String> cities= Stream.of("Pune", "Chennai", "Banglore","Hyderabad");
		cities.filter(city->city.startsWith("B")).forEach(city->System.out.println(city));
		
		int marks[]=new int[] {67,68,48,99,87,77};
		IntStream marksStream= Arrays.stream(marks);
		marksStream.filter(mark->(mark>70)).forEach(mark->System.out.println(mark));
		
		//using builder method
		Builder<String> builder= Stream.<String>builder();
		builder.add("Snehal").add("John").add("Jenny");
		Stream<String> names= builder.build();
		
		//above code in one-line
		Stream<String> names2=Stream.<String>builder()
				.add("Snehal2").add("John2").add("Jenny2").build();
		
		names2.forEach(name->System.out.println(name));
		
		//to generate empty stream
		Stream<Employee> empStream = Stream.empty();
		
		//to generate infinite stream
		Random random = new  Random();
		//Stream<Integer> numbers= 
				Stream.generate(()->{return random.nextInt(100);})
				.limit(5)
				.forEach(num->System.out.println(num));;
		
				
	}

}
