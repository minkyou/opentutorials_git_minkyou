package com.pknu.bread;

public class Consumer extends Thread {
	public void run() {
		while(true) {		// 무한루프
			try {
				BreadTest.sp.buy();
				this.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
