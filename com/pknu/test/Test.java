package com.pknu.test;

import java.util.Arrays;
import java.util.List;

public class Test {
	static int cv;		// class variable
	int iv;				// instance variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
//		int result=0;
		
		FactorialTest factorialTest;				// 메모리에 참조변수 factorialTest를 위한 공간 마련
		factorialTest= new FactorialTest();		// 
		
//		System.out.println(factorialTest.fatorial(12));
//		System.out.println(factorialTest.factorialRevision(12));
		
		// StackOverflowError > 메모리 부족 > 반복문으로 해결
//		System.out.println(factorialTest.factorialRevision(100000));
//		System.out.println(factorialTest.factorialRevision(0));
		
//		int result1=2;
//		for (int i = 0; i < 30; i++) {
//			result1=result1*2;
//		}
//		System.out.println(result1-1);
//		System.out.println(cv);
//		System.out.println(Test.cv);			// 클래스 변수는 
		
//		Test test = new Test();				
//		System.out.println(test.iv);			// 인스턴스 변수는 인스턴스 생성 후 초기화됨. + static메서드에서 non static 필드나 메서드에 접근할 수 없다.
		
		// static변수(클래스변수)
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.abs(-3));
		
		Test test;
//		System.out.println(test.iv);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
//		numbers.forEach(Integer value);
		
//		numbers.forEach(new Consumer<Interger>() {
//			public void accept(Integer value) {
//				System.out.println(value);
//			}
//		});
	}

	static void print() {			// static메서드는 인스턴스 생성 없이 호출 가능
		System.out.println("Static Test");
		System.out.println();
	}
}
