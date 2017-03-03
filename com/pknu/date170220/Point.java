package com.pknu.date170220;

public class Point {
	protected int x, y;
	
	public Point() {
		x=20;
		y=30;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	protected String getLocation() {
		return x+", "+y;
	}
	
	void print() {
		System.out.println("Point Å¬·¡½º");
	}
}
