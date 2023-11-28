package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {
	public static void main(String[] args) {
		
	
	List<String> words = Arrays.asList("apple", "banana", "cherry");

	// Using map to convert each word to uppercase
	List<String> uppercasedWords = words.stream()
	                                   .map(String::toUpperCase)
	                                   .collect(Collectors.toList());

	// Result: ["APPLE", "BANANA", "CHERRY"]
	System.out.println(uppercasedWords);
	
	List<List<Integer>> nestedNumbers = Arrays.asList(
		    Arrays.asList(1, 2, 3),
		    Arrays.asList(4, 5, 6),
		    Arrays.asList(7, 8, 9)
		);

		// Using flatMap to flatten the nested lists
		List<Integer> flattenedNumbers = nestedNumbers.stream()
		                                             .flatMap(List::stream)
		                                             .collect(Collectors.toList());
		System.out.println(flattenedNumbers);

		// Result: [1, 2, 3, 4, 5, 6, 7, 8, 9]


}
}
