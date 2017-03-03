package com.pknu.db;

public class EagerInitialization {

	// ���α׷� ũ�Ⱑ ���� �� > Ŭ������ �ε�Ǵ� ������ �ν��Ͻ� ����
	private static EagerInitialization sei = new EagerInitialization();
	
	// �����ڸ� private���� �Ѵ�.
	private EagerInitialization() {}

	// ��Ⱓ ���X > JVM�� ���� > null�� ����
	public static EagerInitialization getInstance() {
		return sei;
	}
	
}
