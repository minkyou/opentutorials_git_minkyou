package com.pknu.object;

import java.util.ArrayList;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		Object objClone;
		
		String str = "123";
		String str1 = str;
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		str = str+"1";
		System.out.println(str.hashCode());
		ArrayList<String> arr = new ArrayList<>();
		System.out.println(str.toString().getClass()+", " + str1.getClass().getName());	// Class class method getName
		System.out.println(obj);
		
	}

}
