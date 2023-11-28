package com.defaultstatic;

public class AA extends A {

	public void printMessage() {

		System.out.println("Welcome to AA by A");

	}
}

class AAA extends AA {
	public void printMessage() {
		super.printMessage();
		System.out.println("Welcome to AAA by AA");
	}
}
