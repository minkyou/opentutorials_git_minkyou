package com.pknu.date170220;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>();
//		arr.toString();		// ��ӹ��� �� > �ν��Ͻ� ���� ���̵� ��밡���ϴ�
//		System.out.println(arr);			// toString() �ڵ� ȣ��
//		System.out.println(arr.toString());
		
		Point3D p3d = new Point3D(1,2);
		p3d.print();	
		System.out.println(p3d.getLocation());
	}

}
