package com.pknu.exception;

public class ExceptionStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExceptionStack es = new ExceptionStack();
//		es.test();
		es.test2();
	}
	
	public void test() throws Exception {
		test1();
	}
	
	public void test1() throws Exception {
		throw new Exception("호출 스택");
	}
	
	public void test2() {
		test3();
	}
	
	public void test3() {
		try {
			throw new Exception("호출 스택");
		} catch (Exception e) {
			System.out.println("예외 처리");
			e.printStackTrace();
		}
	}
}
