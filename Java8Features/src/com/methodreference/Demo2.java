package com.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(30);
		mylist.add(20);
		mylist.add(50);
		mylist.add(10);
		mylist.add(40);
		
		Stream<Integer> mystream = mylist.stream();
		mystream.forEach(Hello1::show);
		System.out.println("-------------------");
		
		mylist.stream().forEach(Hello1::show); // Static Method Ref Style
		System.out.println("-------------------");
		
		mylist.stream().forEach(System.out::println); // Instance Method Ref Style
		System.out.println("-------------------");
		
		mylist.stream().forEach((x) -> System.out.println(x)); // Eambda Style
	}
}

class Hello1 {
	public static void show(int x) {
		System.out.println(x);
	}
}
