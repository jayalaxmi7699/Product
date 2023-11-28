package com.defaultstatic;

public class StaticMain {

	public static void main(String[] args) {
		StaticHello hello = new StaticHello();
		hello.test();
		// 1. Calling Static Method with Ref. Variable having Null
		// A aobj = null;
		// aobj.m1();
		StaticHello hello1 = null;
		hello1.show();
		// 2. Calling Static Method with Ref. Variable having Object address
		// A aobj = new Hello();
		// aobj.m1();
		StaticHello hello2 = new StaticHello();
		hello2.show();
		// 3. Calling Static Method with Class Name
		StaticA.m1();
		StaticHello.show();
		// Interface Static Methods must called with Interface name always
	}
}
