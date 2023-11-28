package com.functionalinterface;

public class FunctinaolMain implements Functionalsub {
public static void main(String[] args) {
	FunctinaolMain f = new FunctinaolMain();
	f.m1();
	f.m2();
	
	
}

@Override
public void m1() {
	System.out.println("m1()-->from functional");
}

@Override
public void m2() {
	System.out.println("m2()-->from functional");
}
}
