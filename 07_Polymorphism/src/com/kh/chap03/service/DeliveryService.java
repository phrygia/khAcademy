package com.kh.chap03.service;

// interface

/**
 * 인터페이스 -> 추상클래스보다 더욱 강한 규칙성, 강제성을 가짐
 * 필드를 작성하면 상수필드
 * 메소드를 작성하면 추상메서드
 * 
 * -> 무조건 구현해야 하는 기능이 있을 경우
 * -> 인터페이스 설계 사용법만 만들어주고
 * -> 구현하는 쪽에서 이걸 실체화하게 만들어줌
 */
public interface DeliveryService {
	int num = 1; // 일반적인 필드를 가질수 없다.
	// 배달 추상 메서드
	
	/*public abstract */void delivery();
	
	default void close() {
		System.out.println("닫힙니다~");
	}
	// default 키워드 - 인터페이스를 구현한 모든 클래스가 동일하게 수행해야하는 메소드는 default 키워드를 붙여 구현한다.
	
}
