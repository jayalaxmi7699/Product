package com.defaultstatic;

public interface BInterface extends AInterface {
	default void m2() {
		System.out.println("B- m2() ");
//		m1();
	}
		default void m1() {
			System.out.println("B- m1() ");
		}
	}

