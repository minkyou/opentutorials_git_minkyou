package com.pknu.bread;

public class Supply extends Thread {
	public int bread = 100;		// 처음 개수
	static int i = 1;				// 판매
	int j = 1;						// 공급
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				make();
//				wakeUp();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	// synchronized : 동기화 > 메서드가 끝날 동안 접근X
	public synchronized void make() {
		bread += 1;
		System.out.println(j + " 번째 빵 공급");
//		System.out.println("----------확인 "+this.getName());
		this.notify();		// 접근한 thread 깨움, this == Thread-0(Supply2)
		j++;
	}
	
	public synchronized void buy() {
		
		
		
		Thread t = Thread.currentThread();
		
		while(bread == 0) {
			System.out.println("빵 다 팔림");
			System.out.println("wait된 쓰레드 : " + t.getName());
			try {
				wait();		// wait() <-> notify()
				System.out.println("wait에서 깨어난 쓰레드 : " + t.getName());
				System.out.println("쓰레드 상태 : " + t.getState());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		bread -= 1;
		System.out.println(t.getName() + " " + i + " 번째 빵 팔림");
		i++;
	}
	
//	public synchronized void wakeUp() {		// java.lang.IllegalMonitorStateException
//		Thread t = Thread.currentThread();
//		this.notify();
//		System.out.println("notify된 쓰레드 : "+t.getName()+", 상태 : "+t.getState());
//	}
}
