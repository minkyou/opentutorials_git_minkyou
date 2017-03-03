package com.pknu.bread;

public class Supply extends Thread {
	public int bread = 100;		// ó�� ����
	static int i = 1;				// �Ǹ�
	int j = 1;						// ����
	
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
	
	// synchronized : ����ȭ > �޼��尡 ���� ���� ����X
	public synchronized void make() {
		bread += 1;
		System.out.println(j + " ��° �� ����");
//		System.out.println("----------Ȯ�� "+this.getName());
		this.notify();		// ������ thread ����, this == Thread-0(Supply2)
		j++;
	}
	
	public synchronized void buy() {
		
		
		
		Thread t = Thread.currentThread();
		
		while(bread == 0) {
			System.out.println("�� �� �ȸ�");
			System.out.println("wait�� ������ : " + t.getName());
			try {
				wait();		// wait() <-> notify()
				System.out.println("wait���� ��� ������ : " + t.getName());
				System.out.println("������ ���� : " + t.getState());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		bread -= 1;
		System.out.println(t.getName() + " " + i + " ��° �� �ȸ�");
		i++;
	}
	
//	public synchronized void wakeUp() {		// java.lang.IllegalMonitorStateException
//		Thread t = Thread.currentThread();
//		this.notify();
//		System.out.println("notify�� ������ : "+t.getName()+", ���� : "+t.getState());
//	}
}
