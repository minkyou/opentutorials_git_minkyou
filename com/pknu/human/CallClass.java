package com.pknu.human;

public class CallClass {
	static int value = 7;
	int a, b, c;
	
	// Constructor
	CallClass() {
		a=1;
		b=2;
		c=3;
	}
	
	public void test() {
		ReceiveClass rc = new ReceiveClass();
		rc.test(value);
		System.out.println(value);
		
	}
	
	static void staticTest() {
		System.out.println("--------");
	}
	
	
	static int staticTest1() {
		return value;
	}
	
}
