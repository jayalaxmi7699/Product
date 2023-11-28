package com.defaultstatic;

public interface AInterface {
	default void m1() {
		System.out.println("A- m1() ");
	}
}
