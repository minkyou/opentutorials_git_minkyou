package com.pknu.generic;

public class Tv implements Elec {
	
	@Override
	public void up() {
		System.out.println("Tv ������");
	}

	@Override
	public void down() {
		System.out.println("Tv �����ٿ�");
	}
	
}
