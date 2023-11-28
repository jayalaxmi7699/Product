package com.optional1;

import java.util.Map;
import java.util.stream.Collectors;

/*
* @Author : Srinivas Dande
* @Company: Java Learning Center
* */
public class Demo3 {
	public static void main(String[] args) {
//		List<Student> studentList = DataUtil.getStudentList();
//		studentList.stream().sorted((stu1, stu2) -> stu1.getStudentName().compareTo(stu2.getStudentName()))
//				.forEach(System.out::println);
//		System.out.println("--------------------------");
//		List<Student> mylist = studentList.stream()
//				.sorted((stu1, stu2) -> stu2.getStudentName().compareTo(stu1.getStudentName()))
//				.collect(Collectors.toList());
//		mylist.forEach(System.out::println);
		
		String s="maharastra";
		Map<Object, Long > h = s.chars().mapToObj(f->(char)f).collect(Collectors.groupingBy(g->g, Collectors.counting()));
	System.out.println(h);
	}
}
