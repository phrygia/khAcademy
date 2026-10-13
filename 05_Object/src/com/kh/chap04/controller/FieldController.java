package com.kh.chap04.controller;

/*
 * 필드 == 멤버변수 == 객체가 가지는 속성 (데이터담당)
 * 
 * 클래스 구성하는 요소 중 하나
 * 데이터를 저장하기 위한 역할(변수)
 * 위치 : 클래스 스코프
 * 
 * 인스턴스 변수
 * 클래스 변수 = static 필드
 * 
 * 
 * */

public class FieldController {
	// 접근제한자: public 
	public int global;
	public static String str = "나는 스태틱";
	// 프로그램 구동 중 계속 값을 사용해야 하는 경우에만 사용
	public static final String JAVA_VERSION = "21";
	// 선언 + 초기화 진행 > 절대 못바꾸게 사용
	
	// 기본생성자
	public FieldController() {}
	public FieldController(int global) {
		this.global = global;
	}

	
	// 메서드 선언
	public void checkVariable(int parameter) {
		int local = 1;
		
		System.out.println(global); // 필드
		System.out.println(local); // 지역변수
		System.out.println(parameter); // 지역변수
	}
}
