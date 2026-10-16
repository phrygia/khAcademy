package com.kh.chap02.model.dto;

public abstract class Cook { // abstract - 추상클래스 선언
	private String name;

	public Cook(String name) {
		this.name = name;
	}
	
	// 자식클래스들이 오버라이딩 하기 위해서 선언만 해놓을 용도
//	public void cooking() {}
	
	// 추상클래스로 선언 - abstract 
	public abstract void cooking();
	public void breakTime() {
		System.out.println("쉬는 시간입니다.");
	}
	
}
