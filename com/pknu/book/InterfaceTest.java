package com.pknu.book;

import java.util.ArrayList;
import java.util.Iterator;

public class InterfaceTest {
	
	public static void main(String[] args) {
//		부모 인터페이스를
//		System.out.println(Elec.x);
//		Elec.x = 7;
		
		ArrayList<Elec> elecArray = new ArrayList<>();
		
		Elec elec = new Tv();	// 의존관계
//		elec.up();
//		elec.down();
//		
		Elec elec1 = new Mp3();
//		elec1.up();
//		elec1.down();
		
		// Anonymous Class
		Elec elec2 = new Elec() {
			
			@Override
			public void up() {
				System.out.println("mp3 볼륨업");
				
			}
			
			@Override
			public void down() {
				System.out.println("mp3 볼륨업");
			}
		};
//		
//		elec2.up();
//		elec2.down();
		
		elecArray.add(elec);
		elecArray.add(elec1);
		elecArray.add(elec2);
//		elecArray.add(new Mp3());
//		elecArray.get(0).up();
//		elecArray.get(1).down();
		
//		System.out.println(elecArray.contains(elec));
		
//		System.out.println();
		
//		일관성 & 유지보수
		for(Elec i:elecArray) {
			i.up();
			i.down();
		}
		
//		Iterator iterator = elecArray.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		if(elec instanceof Mp3) {		// 참조변수와 타입을 비교
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
//		InstanceOfTest iot = new InstanceOfTest();
//		iot.instanceOfTest(elec);
	}

}
