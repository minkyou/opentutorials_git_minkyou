package com.pknu.db;

public class NonSingleton {
	
	public static NonSingleton getInstance() {
		return new NonSingleton();		// �ν��Ͻ� ��� ���� ����
	}
}
