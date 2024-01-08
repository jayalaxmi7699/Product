package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingStringList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "mango", "Banana", "Guava", "Apple", "Orange", "Banana", "Guava","PineApple", "Avacado");
		String s = "Welcome to Java";
//		list.stream().filter(g -> g.startsWith("A")).forEach(System.out::println);)
		Character[] charArray = s.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		for (char c : charArray) {
			System.out.println(c + " ");}

		List<String> withoutDuplicate = list.stream().sorted().distinct().collect(Collectors.toList());
		  // Print elements that start with "A"
		System.out.println("Print elements that start with \"A\"");
        list.stream().filter(j -> j.startsWith("A")).forEach(System.out::println);
		System.out.println("withoutDuplicate " + withoutDuplicate);
		long count = list.stream().filter(r -> r.contains("Apple")).count();
		System.out.println("Count of Apple " + count);
// First duplicate from list
		String firstDuplicate2 = list.stream().distinct().collect(Collectors.toMap(v -> v, v -> 1, Integer::sum))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println("First duplicate : " + firstDuplicate2);
// Find only elements that have duplicates more than once
		List<String> duplicatesMoreThanOnce = list.stream().collect(Collectors.groupingBy(q -> q, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Duplicates appearing more than once: " + duplicatesMoreThanOnce);
//Occurances of sentence
		Map<Object, Long> Occurances = s.chars().mapToObj(d -> (char) d)
				.collect(Collectors.groupingBy(f -> f, Collectors.counting()));
		System.out.println("Occurances of sentence "+Occurances);
// Occurances of string		
		String s1 = "JayaLaxmi";
		Map<Character, Long> occurance = s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(g -> g, Collectors.counting()));
		System.out.println("Occurances of string "+occurance);
//to print each letter double
		String doubleletter = s1.chars().mapToObj(c -> String.valueOf((char) c) + (char) c).collect(Collectors.joining()); 
		System.out.println("Print each letter into double char: "+ doubleletter);
// WithoutSpaces
		String s5 = "Wel come to Ja va";
		String WithoutSpaces = s5.chars().filter(c -> c != ' ').mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		System.out.println(WithoutSpaces);
		Map<Character, Long> occurances = s1.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println("occurances-------- "+occurances);
// Reverse a string	
	StringBuffer b= new StringBuffer("JayaLaxmi");
	System.out.println("Reverse String "+b.reverse());
	
	
	        String originalNumericString = "1223456";
	        String reversedNumericString = reverseNumericString(originalNumericString);
	      
	        System.out.println("Reversed Numeric String: " + reversedNumericString);
	    }

	    public static String reverseNumericString(String numericString) {
	        return new StringBuilder(numericString)
	                .reverse()
	                .toString();
	    }
	

}}
