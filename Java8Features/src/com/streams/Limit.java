package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		mylist.stream().limit(10).forEach(System.out::println);
		System.out.println("---------------------");
		mylist.stream().limit(10).filter(num -> num % 2 != 0).map(num -> num * num).forEach(System.out::println); // 3
		System.out.println("---------------------");

		int thirs = mylist.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);

//		 // third highest number
//        int thirdHighest = mylist.stream()
//                .distinct()  // Remove duplicates if any
//                .sorted(Comparator.reverseOrder())  // Sort in descending order
//                .skip(2)  // Skip the first two highest numbers
//                .findFirst()  // Get the third highest
//                .orElse(-1); // In case list has less than 3 unique numbers
//
		System.out.println("The third highest number is: " + thirs);

		List<Integer> thir = mylist.stream().distinct().sorted().skip(1).limit(1)
				.collect(Collectors.toList());
		System.out.println(thir);
	}
}
