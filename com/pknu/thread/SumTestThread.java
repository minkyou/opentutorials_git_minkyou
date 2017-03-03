package com.pknu.thread;

public class SumTestThread extends Thread {
	long amount;
//	long total=0;
	
	public SumTestThread(long amount) {
		this.amount = amount;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long before = System.currentTimeMillis();
		for(long i = amount - 3_000_000_000L; i <= amount; i++) {
			Main.total += i;
		}
		System.out.println(System.currentTimeMillis() - before);
		System.out.println(Main.total);
	}
}
