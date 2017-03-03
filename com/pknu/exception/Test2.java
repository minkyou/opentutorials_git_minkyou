package com.pknu.exception;

public class Test2 {
	public void test() {
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.test(0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Test2클래스에서 호출할 때 에러");
		}
	}
}
