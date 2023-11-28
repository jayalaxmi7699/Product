package com.defaultstatic;

public class StaticHello implements StaticA, StaticB{

	public void test() {
		
			m1();
			StaticA.m1();
			StaticB.m1();
			}
			static void m1() {
			System.out.println("Hello- m1()");
			}
			static void show() {
			System.out.println("Hello- show()");
			}
	}

