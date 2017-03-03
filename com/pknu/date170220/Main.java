package com.pknu.date170220;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>();
//		arr.toString();		// 상속받은 것 > 인스턴스 생성 없이도 사용가능하다
//		System.out.println(arr);			// toString() 자동 호출
//		System.out.println(arr.toString());
		
		Point3D p3d = new Point3D(1,2);
		p3d.print();	
		System.out.println(p3d.getLocation());
	}

}
