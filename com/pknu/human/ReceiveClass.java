package com.pknu.human;

public class ReceiveClass {
	public void test(int value) {
		value = 1234;
		System.out.println(value);
	}
	
	public int test1() {
		return 77;
	}
	
	public MagicSquare test2() {
		return new MagicSquare();
	}
	
	// Method Overroading
	public float sum(int first, float second) {
		return first+second;
	}
	
	public float sum(float... num) {
		float result=0;
		for(float i:num) {
			result+=i;
		}
		
		return result;
	}
}
