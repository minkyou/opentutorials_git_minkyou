package com.pknu.book;

public class Test_Main {
	public static void main(String[] args) {
		Card cd = new Card();
		Card cd1 = new Card(2, "red", "clover");
//		cd1.color="black";
		Card cdCopy = new Card(cd1);
		cd1.color = "black";
		
		cd.print();
		cd1.print();
		cdCopy.print();
		
//		Object oj = new Object();
//		System.out.println(oj);
//		System.out.println(cd);
		
//		System.out.println(Card.j);
//		Card.staticTest();
//		System.out.println(Card.j);
		
//		abstract 클래스는 인스턴스화할 수 없다.
//		AbstractTests at = new AbstractTests();
	}
}
