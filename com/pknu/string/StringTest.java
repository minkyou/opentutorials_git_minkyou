package com.pknu.string;

public class StringTest {
	// a=b=c
	String a = "123";
	String b = "123";
	String c = new String("123");
	String d,h;
	String g = "12345";
	
	StringBuffer e = new StringBuffer("abc");
	StringBuffer i;
	StringBuilder f = new StringBuilder("abc");
	Object obj = new Object();
	
	public void test1() {
		d=g;
		h=g;
		System.out.println(d==h);
		h=g.substring(0, g.length()-2);
		System.out.println(h);
		System.out.println(d==h);
	}
	
	public void test() {
//		System.out.println(a==b);
//		System.out.println(a==c);				// 주소 비교
//		System.out.println(a.equals(c));		// 값 비교
//		System.out.println(e);
//		System.out.println(obj);
	}
	
	// 매개변수로 
	public void testCharSeq(CharSequence cs) {
		StringBuffer sb = new StringBuffer(cs);
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
