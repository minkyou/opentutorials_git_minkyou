package com.pknu.db;

public class NonSingleton {
	
	public static NonSingleton getInstance() {
		return new NonSingleton();		// 인스턴스 계속 새로 생성
	}
}
