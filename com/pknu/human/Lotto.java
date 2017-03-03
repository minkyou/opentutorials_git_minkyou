package com.pknu.human;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	
	int[] lotto;
	int size;
	int length;
	Random random = new Random();

	public void makeLotto() {
		lotto = new int[length];
		lotto[0]=random.nextInt(45)+1;
		int num=0;
		
		while(num<length) {
			int temp = random.nextInt(45)+1;
			lotto[num] = temp;
			for(int j=0; j<num; j++) {
				if(lotto[j] == temp) {
					num--;
					break;
				}
			}
			num++;
		}
		
		for(int i : lotto) {
			System.out.print(i+"\t");
		}
	}
	
	public void makeLottoContinue() {
		int num=0;
		int temp = random.nextInt();
		for(int j=0; j<num; j++) {
			if(lotto[j]==temp) {
				j=-1;
				continue;
			}
			
			lotto[num]=temp;
		}
		
		for(int i : lotto) {
			System.out.println(i);
		}
	}
	
	// TreeSet : auto sorting, duplicated number add X
	public void makeLottoTreeSet() {
		Random rd = new Random();
		TreeSet<Integer> ts = new TreeSet<>();
		
		while(ts.size()<6) {
			ts.add(rd.nextInt(45)+1);
		}
		
		// 
		System.out.println(ts);
	}
}
