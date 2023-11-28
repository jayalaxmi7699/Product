package com.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingList {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 67, 78, 45, 34, 12, 35, 78, 9, 90, 2, 4, 6, 1, 4, 6,7};
		List<int[]> l = Arrays.asList(arr);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 67, 78, 45, 34, 12, 35, 78, 9, 90, 2, 4, 6, 1, 4, 6,7);
		List<Integer> list1 = Arrays.asList(1,4,4,6,9,2,9,56,67, 35, 78, 9, 90, 2, 4, 6, 1, 4, 6,7);
		List<Integer> even =list.stream().filter(f->f%2==0).distinct().collect(Collectors.toList());
		System.out.println("Even numbers "+even);
		List<Integer> odd =list.stream().filter(f->f%2!=0).distinct().collect(Collectors.toList());
		System.out.println("Odd numbers "+odd);
		List<Integer> increasing=list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("natural Order "+increasing);
		List<Integer> decreasing=list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println("Decreasing Order "+decreasing);
		Integer findfirst = list.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().orElse(-1);
		System.out.println("Highest number "+findfirst);
		Integer Thirdhighest = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().orElse(-1);
		System.out.println("ThirdHighest "+Thirdhighest);
		
		List<String> contains = list.stream().map(j->String.valueOf(j)).filter(f->f.contains("2")).collect(Collectors.toList());
		System.out.println("Value contains from list are "+contains);
		
		List<String> startswith = list.stream().map(g->String.valueOf(g)).filter(n->n.contains("5")).collect(Collectors.toList());
		System.out.println("startswith "+startswith);
		List<Integer> twoLists = Stream.concat(list.stream(), list1.stream()).sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println("Merges lists "+twoLists);
				
		List<Integer> limit_Ski=list.stream().filter(d->d%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println("limit_Skip"+limit_Ski);
		List<Integer> limit_Skip=list.stream().limit(5).skip(1).filter(d->d%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println("limit_Skip"+limit_Skip);
		List<Integer> limit_Sk=list.stream().skip(1).limit(2).filter(d->d%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println("limit_Skip"+limit_Sk);
	}
}
