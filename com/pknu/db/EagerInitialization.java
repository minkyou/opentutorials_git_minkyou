package com.pknu.db;

public class EagerInitialization {

	// 프로그램 크기가 작을 때 > 클래스가 로드되는 시점에 인스턴스 생성
	private static EagerInitialization sei = new EagerInitialization();
	
	// 생성자를 private으로 한다.
	private EagerInitialization() {}

	// 장기간 사용X > JVM이 제거 > null을 리턴
	public static EagerInitialization getInstance() {
		return sei;
	}
	
}
