package com.pknu.bread;

public class Consumer extends Thread {
	public void run() {
		while(true) {		// ���ѷ���
			try {
				BreadTest.sp.buy();
				this.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
