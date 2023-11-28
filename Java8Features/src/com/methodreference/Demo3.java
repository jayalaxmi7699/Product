package com.methodreference;

import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {

		int myarr1[] = { 20, 40, 30, 50, 10 };
		// 1.Lambda Style
		Hello2 hello1 = (arr) -> {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		};
		hello1.test(myarr1);
		for (int x : myarr1) {
			System.out.println(x);
		}
		System.out.println("------------------");
		int myarr2[] = { 99, 88, 20, 40, 30, 50, 10 };
		// 2.Method Refernce Style
		Hello2 hello2 = Arrays::sort;
		hello2.test(myarr2);
		for (int x : myarr2) {
			System.out.println(x);
		}
	}
}
