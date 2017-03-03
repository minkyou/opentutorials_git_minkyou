package com.pknu.book;

public class Card {
	int num;
	String color, shape;
//	static int j=9;
	
//	 Constructor
//	Card() {
//		this(1, "black", "diamond");
//	}
	
	public Card() {
		this(1, "black", "diamond");
	}
	
	Card(int num, String color, String shape) {
		this.num = num;
		this.color = color;
		this.shape = shape;
	}
	
	Card(Card card) {
//		num = card.num;
//		color = card.color;
//		shape = card.shape;
		this(card.num, card.color, card.shape);
	}
	
	public void print() {
		System.out.println(num+", "+color+", "+shape);
	}
	
//	static void staticTest() {
//		j=8;
//	}
}