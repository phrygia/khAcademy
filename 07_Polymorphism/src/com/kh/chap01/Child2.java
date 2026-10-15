package com.kh.chap01;

// Parent 클래스의 타입을 상속받음 - Parent 클래스의 타입을 다룰 수 있다.
public class Child2 extends Parent {
	private int z;
	
	public void printChild2() {
		System.out.println("두번째 자실 클레스 메서드 호출");
	}	
	
	@Override
	public void print() {
		System.out.println("Child2의 오버라이딩 한 메소즈");
	}
}
