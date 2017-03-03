package com.pknu.human;

public class ForTest {
	public void gugu() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	
	public void guguWhile() {
		int i=1;
		int j=1;
		
		while(i < 10) {
			while(j < 10) {
				System.out.print(i+"*"+j+"="+i*j+" ");
				j++;
			}
			
			j=1;
			i++;
			System.out.println();
		}
	}
	
	public void drawStar() {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void drawStarReverse() {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if(i<j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
	}
	
	public void drawStarReverse1() {
		for (int i = 1; i < 6; i++) {
			for(int j=1; j < 6; j++) {
				if(i+j >= 6) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
	}
	
	public void drawDiamond(int size) {
		int realSize = size*2+1;
		int center = realSize/2;
		
		for (int i = 0; i < realSize; i++) {
			for (int j = 0; j < realSize; j++) {
				
				// 조건 4가지
				if(i+j==center || center+i==j || center+j==i || i+j==3*center) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
	}
}
