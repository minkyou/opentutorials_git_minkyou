package com.pknu.bread;

public class BreadTest {
	
	public static Supply sp = new Supply();		// °øÀ¯

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sp.start();
		
		try {
			Consumer cs = new Consumer();
			Consumer cs1 = new Consumer();
			Consumer cs2 = new Consumer();
			Consumer cs3 = new Consumer();
			cs.start();
			cs1.start();
			cs2.start();
			cs3.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
