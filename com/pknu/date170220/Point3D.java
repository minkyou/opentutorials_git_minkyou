package com.pknu.date170220;

public class Point3D extends Point {
	int z;
	static final int XX_X=1;
	
	public Point3D() {
		
	}
	public Point3D(int x, int y) {
		this();
	}
	
	protected String getLocation()	{
		return super.getLocation()+", "+z;
	}
	
	Print3D p3d = new Print3D();
	void print() {
//		super.print();
//		p3d.print();
		System.out.println("super.x="+super.x);
		System.out.println("this.x="+this.x);
		System.out.println("this.y="+this.y);
	}
	
}
