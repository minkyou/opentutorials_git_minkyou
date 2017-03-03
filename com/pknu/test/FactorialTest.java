package com.pknu.test;

public class FactorialTest {
	static int cv;
	int iv;
	
	public int fatorial(int num) {
		int result=0;
		
		if(num==1) {
			result=1;
		} else {
			result = num*fatorial(num-1);
		}
		
		return result;
	}
	
	public int factorialRevision(int num) {
		if(num<0 || num>12) return -1;		// int는 약 20억까지 표현 가능
		if(num==1) return 1;
		
		return num*factorialRevision(num-1); 
	}
	
	public void test() {
		System.out.println(cv);
		System.out.println(iv);
	}
}
