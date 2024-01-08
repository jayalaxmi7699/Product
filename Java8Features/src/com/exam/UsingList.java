package com.exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UsingList {
	public static void main(String[] args) {
		int arr[] = { 12, 2, 4, 5, 6, 7, 89, 13, 12, 45, 45, 56, 56, 7, 12 };
		List<Integer> list = Arrays.asList(12, 2, 4, 5, 6, 7, 89, 13, 12, 45, 45, 56, 56, 7, 12);

		Arrays.stream(arr).filter(f -> f % 7 == 0).map(g -> g * g).forEach(System.out::println);

		Optional<Integer> secondhighest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();
		System.out.println("secondhighest :" + secondhighest);

		List<String> f = list.stream().map(k -> String.valueOf(k)).filter(d -> d.contains("5"))
				.collect(Collectors.toList());
		System.out.println("which contains 5 is : " + f);

		List<Integer> listin = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending order : " + listin);

		Set<Integer> Oddnumbers = list.stream().filter(s -> s % 2 != 0).distinct().collect(Collectors.toSet());

		List<String> stlist = Arrays.asList("Apple", "mango", "Banana", "Guava", "Apple", "Orange", "Banana", "Guava",
				"PineApple", "Avacado");
		List<String> newlist = stlist.stream().filter(l -> l.startsWith("O")).collect(Collectors.toList());
		System.out.println("newlist : " + newlist);
		List<String> containslist = newlist.stream().filter(j -> j.contains("Apple")).collect(Collectors.toList());
		System.out.println("containslist : " + containslist);
		String s = "Welcome to Java jvfjigiieirieio";
		Map<Object, Long> Occurances = s.chars().mapToObj(h -> (char) h)
				.collect(Collectors.groupingBy(g -> g, Collectors.counting()));
		System.out.println("Occurances : " + Occurances);
		String doubleletters = s.chars().mapToObj(k -> String.valueOf((char) k + (char) k))
				.collect(Collectors.joining());
		System.out.println("doublechar: " + doubleletters);
	}
}
