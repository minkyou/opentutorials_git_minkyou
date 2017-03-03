package com.pknu.exception;

public class ExceptionTest {
	public void test(int number) {
		try {
			int result = 4/number;
			System.out.println(result);
		}
		// jdk1.6까지 catch exception 이렇게 선언 > 1.7부터 | 연산자로 exception 여러개 붙일수 있음 (멀티캐치)
//			catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.toString()); 		// e.printStackTrace()와 같은 문장
//			System.out.println(e.getMessage());	// 문제되는 것만 출력
//		}
		catch (Exception e) {
			e.printStackTrace();
//			try {
//				
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
		}
		finally {	// 무조건 실행
			System.out.println("finally 출력");
		}
	}
	
	public void throwTest() {
		try {
//			Exception e = new Exception("123");
//			throw e;
			throw new Exception("고의로 발생시킴");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
//		et.test(0);
//		et.test(4);
		et.throwTest();
//		Test1 t1 = new Test1();
//		t1.test();
//		Test2 t2 = new Test2();
//		t2.test();
	}

}
