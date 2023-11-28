package com.methodreference;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(3);
		mylist.add(2);
		mylist.add(5);
		mylist.add(1);
		mylist.add(4);
		
		mylist.stream().filter(MyNumber::isEven).forEach(System.out::println);
		System.out.println("-------------------");
		mylist.stream().filter(MyNumber::isOdd).forEach(System.out::println);
		System.out.println("-------------------");
		mylist.stream().filter(a -> a % 2 == 0).forEach(a -> System.out.println(a));
		System.out.println("-------------------");
		mylist.stream().filter(a -> a % 2 != 0).forEach(a -> System.out.println(a));
		System.out.println("-------------------");
	}
}

class MyNumber {
	public static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int number) {
		if (number % 2 != 0)
			return true;
		else
			return false;
	}
}