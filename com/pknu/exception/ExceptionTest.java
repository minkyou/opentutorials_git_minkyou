package com.pknu.exception;

public class ExceptionTest {
	public void test(int number) {
		try {
			int result = 4/number;
			System.out.println(result);
		}
		// jdk1.6���� catch exception �̷��� ���� > 1.7���� | �����ڷ� exception ������ ���ϼ� ���� (��Ƽĳġ)
//			catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.toString()); 		// e.printStackTrace()�� ���� ����
//			System.out.println(e.getMessage());	// �����Ǵ� �͸� ���
//		}
		catch (Exception e) {
			e.printStackTrace();
//			try {
//				
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
		}
		finally {	// ������ ����
			System.out.println("finally ���");
		}
	}
	
	public void throwTest() {
		try {
//			Exception e = new Exception("123");
//			throw e;
			throw new Exception("���Ƿ� �߻���Ŵ");
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
