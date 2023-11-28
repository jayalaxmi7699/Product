package com.lambda;

public class LambdaE2 {

	public static void main(String[] args) {
		LambdaE le = () -> {
			System.out.println("HEllo");
		};
		le.display();
		le.display1();
		LambdaE.m2();
		
		LambdaE le1 = () -> {
			System.out.println("HEllo...........");
		};
		le1.display();
		le1.display1();
		LambdaE.m2();
	}
}
