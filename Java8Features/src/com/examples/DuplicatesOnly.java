package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesOnly {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 45, 67, 23, 1, 2, 1, 1, 3, 4, 5, 82, 2, 2, 1);
		
		
		Map<Integer, Long> occ= numbers.stream().collect(Collectors.groupingBy(j->j, Collectors.counting()));
		System.out.println(occ);
//		occ.entrySet().stream().filter(i->i.getValue()>1).forEach(i->System.out.println(i.getKey()+"--->"+i.getValue()));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// Using Java 8 Stream API to count occurrences of each number
//		Map<Integer, Long> occurrences = numbers.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		// Print only the duplicates
//		occurrences.entrySet().stream().filter(entry -> entry.getValue() > 1)
//				.forEach(entry -> System.out.println(entry.getKey() +"--->"+ entry.getValue()));
//
//		List<Integer> numbers1 = Arrays.asList(1, 2, 1, 3, 4, 4);
//		Set<Integer> duplicated = numbers1.stream().filter(n -> numbers1.stream().filter(x -> x == n).count() > 1)
//				.collect(Collectors.toSet());
//		System.out.println(duplicated);
	}
}
