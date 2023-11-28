package com.lambda;

public interface LambdaE {
	void display();

	 default void display1() {
		System.out.println("display1");
	}

	static void m2() {
		System.out.println("m2....");
	}
}
