package com.streams;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UsingLists1 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
		
		
	int f1=	numList.stream().filter(f->f%2!=0).reduce(0, Integer::sum);
	System.out.println("ODD Numbers count "+f1);
		Optional<Integer> mycourse1 = numList.stream().findAny();
		mycourse1.ifPresent(System.out::println);
		System.out.println("-------------");
		Optional<Integer> mycourse2 = numList.stream().findFirst();
		mycourse2.ifPresent(System.out::println);
		System.out.println("-------------");
		Optional<Integer> mycourse3 = numList.stream().parallel().findAny();
		mycourse3.ifPresent(System.out::println);
		System.out.println("-------------");
		Optional<Integer> mycourse4 = numList.stream().parallel().findFirst();
		mycourse4.ifPresent(System.out::println);
		System.out.println("-------------");
		System.out.println("Done!!!");

		List<Integer> numsList = Arrays.asList(5, 4, 8, 3, 6, 7, 2, 9, 8, 3, 6, 7);
		List<Integer> mylist1 = numsList.stream().filter(num -> num % 2 == 0).map(num -> num * num).sorted()
				.collect(Collectors.toList());
		System.out.println(mylist1);
		System.out.println("-------------");
		List<Integer> mylist2 = numsList.stream().filter(num -> num % 2 == 0).map(num -> num * num).sorted()
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println("Linked list " + mylist2);
		Set<Integer> mylist3 = numsList.stream().filter(num -> num % 2 == 0).map(num -> num * num).sorted()
				.collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println("Set " + mylist3);
	}

}
