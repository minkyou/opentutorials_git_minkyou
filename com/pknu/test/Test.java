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
		
		FactorialTest factorialTest;				// �޸𸮿� �������� factorialTest�� ���� ���� ����
		factorialTest= new FactorialTest();		// 
		
//		System.out.println(factorialTest.fatorial(12));
//		System.out.println(factorialTest.factorialRevision(12));
		
		// StackOverflowError > �޸� ���� > �ݺ������� �ذ�
//		System.out.println(factorialTest.factorialRevision(100000));
//		System.out.println(factorialTest.factorialRevision(0));
		
//		int result1=2;
//		for (int i = 0; i < 30; i++) {
//			result1=result1*2;
//		}
//		System.out.println(result1-1);
//		System.out.println(cv);
//		System.out.println(Test.cv);			// Ŭ���� ������ 
		
//		Test test = new Test();				
//		System.out.println(test.iv);			// �ν��Ͻ� ������ �ν��Ͻ� ���� �� �ʱ�ȭ��. + static�޼��忡�� non static �ʵ峪 �޼��忡 ������ �� ����.
		
		// static����(Ŭ��������)
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

	static void print() {			// static�޼���� �ν��Ͻ� ���� ���� ȣ�� ����
		System.out.println("Static Test");
		System.out.println();
	}
}
