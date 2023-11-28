package com.methodreference;

public class MethodRef3 {
	public static void main(String[] args) {
		MethodRef mr = (a, b) -> {
			int sum1 = a + b;
			return sum1;
		};

		int sum1 = mr.sum(100, 50);
		System.out.println("Sum : " + sum1);
		
		MethodRef hello2 = MethodRef2::add;
		int sum2 = hello2.sum(100, 50);
		System.out.println("Sum : " + sum2);
		MethodRef hello3 = Integer::sum;
		int sum3 = hello3.sum(100, 50);
		System.out.println("Sum : " + sum3);
		MethodRef hello4 = Integer::max;
		int max = hello4.sum(100, 50);
		System.out.println("Max : " + max);
		MethodRef hello5 = Integer::min;
		int min = hello5.sum(100, 50);
		System.out.println("Min : " + min);
		System.out.println("Done!!!");
	}
}
