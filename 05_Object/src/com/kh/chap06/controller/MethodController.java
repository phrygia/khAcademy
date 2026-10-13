package com.kh.chap06.controller;

public class MethodController {
	/*
	 * 메소드 (Method) 
	 * */
	
	// 정수값 2개를 받아서 합을 반환해주는 기능 구현
	
	// 접근제한자 예약어 반환형 메소드식별자 (매개변수자료형 매개변수 식별자) {}
	
	public MethodController() {
		
	}
	
	// method signature - 메소드 고유 식별값
	public int add (int a, int b) { // method body
		return a + b; // return value
	}
	
	// 근본 -> 매개변수, 반환 
	public int fn (int num) {
		return num * 2;
	}
	
	private String returnStr() {
		return "반환값";
	}
	
	public String fn2 () {
		return returnStr();
	}
	
	/**
	 * 메소드 오버로딩 (Method OverLoading)
	 */
	public void method() {
		System.out.println("메소드 오버로딩1");
	}
	
	// 식별자: method - 매개변수 다르게 하면 동일한 이름 가능
	public void method(int a) {
		System.out.println("메소드 오버로딩2");
	}
	public void method(int a, int b) {
		System.out.println("메소드 오버로딩3");
	}
	public void method(String s) {
		System.out.println("메소드 오버로딩4");
	}
	public void method(int a, String s) {
		System.out.println("메소드 오버로딩5");
	}
	public void method(String s, int a) {
		System.out.println("메소드 오버로딩6");
	}
} 
