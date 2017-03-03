package com.pknu.human;

public class IfTest {
	public void test(int score) {
		if(score>90) {
			System.out.println("A");
		} else if(score>80) {
			System.out.println("B");
		} else if(score>70) {
			System.out.println("C");
		} else {
			System.out.println("..");
		}
	}
	
	public void switchTest(int score) {
		switch(score) {
		case 90 :
			System.out.println("A");
			break;
		case 80 :
			System.out.println("B");
			break;
		case 70 :
			System.out.println("C");
			break;
		default :
			System.out.println("..");
			break;
		}
	}
}
