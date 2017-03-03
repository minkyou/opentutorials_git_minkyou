/**
 * Single Thread > Singleton
 */

package com.pknu.db;

public class SingletonEdu {

	// ���α׷� ũ�Ⱑ ���� �� > Ŭ������ �ε�Ǵ� ������ �ν��Ͻ� ����
//	private static SingletonEdu sei = new SingletonEdu();
	private static SingletonEdu sei;
	
	// �����ڸ� private���� �Ѵ�.
	private SingletonEdu() {}

	// ��Ⱓ ���X > JVM�� ���� > null�� ����
	public static SingletonEdu getInstance() {
		if(sei == null) {
			sei = new SingletonEdu();
		}
		return sei;
	}
	
}
