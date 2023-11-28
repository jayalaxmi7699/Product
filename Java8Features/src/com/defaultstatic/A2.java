package com.defaultstatic;

public class A2 implements A1 {

	public void test() {
		System.out.println(P); // Inherited
		System.out.println(Q); // Inherited
		m1(); // Overriden
		m2(); // Overriden
		m3(); // Overriden
		A1.super.m3();
		m4(); // Inherited
		A1.super.m4();
		A1.m5();
		A1.m6();
		// A.super.m6();
	}

	@Override
	public void m1() {
		System.out.println("Hello -m1");
	}

	@Override
	public void m2() {
		System.out.println("Hello -m2");
	}

	@Override
	public void m3() {
		System.out.println("Hello -m3");
	}

	/*
	 * @Override public static void m5() { System.out.println("Hello -m5"); }
	 */

}
