package com.pknu.book;

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
//		c.method();
		
		Point2D p2d = new Point2D();
		System.out.println(p2d.getLocation());
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

class Point {
	int x=1, y=2;
	
	String getLocation() {
		return "x:"+x+", y:"+y;
	}
}

class Point2D extends Point {
	int z=3;
	
	String getLocation() {
//		return "x:"+x+", y:"+y+", z"+z;
		return super.getLocation()+", z:"+z;
	}
}