package com.pknu.thread;

public class SumTest {
	long i;
	
	public void test() {
		long before = System.currentTimeMillis();
		for(i = 0; i < 9_000_000_000L; i++) {
			Main.total1 += i;
		}
		System.out.println(Main.total1);
		// MilliSecond > 1/1,000 ��
		System.out.println("�̱۽����� : "+(System.currentTimeMillis() - before));
	}
}
