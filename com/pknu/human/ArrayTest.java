package com.pknu.human;

public class ArrayTest {
	int[] human = {1,3,5,7,9};
	
	public void test() {
		for(int i : human) {
			System.out.println(i);
		}
	}
	
	public void arrayTest2D() {
		// 2차원 배열 선언
		int[][] human = new int[5][5];
		
		int[][] human1 = new int[5][];
		human1[0] = new int[2];
		human1[1] = new int[4];
		
		int value=0;
		
		for(int i=0; i<human.length; i++) {
			for(int j=0; j<human[i].length; j++) {
				System.out.print(human[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(human1[0].length);
		System.out.println(human1[1].length);
		

		for(int i=0; i<human.length; i++) {
			for(int j=0; j<human[i].length; j++) {
				human[i][j]=value;
				value++;
			}
			System.out.println();
		}
		
		for(int i=0; i<human.length; i++) {
			for(int j=0; j<human[i].length; j++) {
				System.out.print(human[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//향상된 for문
		for(int[] i:human) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
