package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Oddeven {
public static void main(String[] args) {
	List<Integer> list =Arrays.asList(12, 13,14, 67,34,92,68, 78, 56);
	
	Stream<Integer> t = list.stream();
	t.forEach(System.out::println);
//	t.parallelStream().forEach(System.out::println);

	System.out.println(list);
	
	list.stream().filter(a->a%2==0).map(s->s*s).forEach(System.out::println);
	System.out.println("__");
	
	list.stream().filter(a->a%2!=0).map(s->s*s*s).forEach(System.out::println);
}
}
