package com.kh.chap01.abstraction.model.vo;
// vo - 3개의 영역으로 나눔



/* 외부 */
// Dog의 모양 - 자료형 
public class Dog {
	/* 내부 */
	// [필드부] - dog 가질수 있는 값에대한 정보를 저장
	// 이름, 종, 나이, 성별, 중성화여부
	public String name; // 개의 이름 저장 필요? - 필드
	public String speices;
	public int age;
	public char gender; // 성별 -> M/F(남,여)
	public boolean neuter; 
	
	// [생성자부] - 
	
	
	// [메서드부] => Dog가 수행할 수 있는 행위(기능)
	public void walk() { // 걸을때 나의 이름을 말하면서 걷고 싶다.
		System.out.println(name + "이(가) 걸어요");
	}
	
	/*
	 * { System.out.println(); // out : 필드 }
	 */
	
	public void tailWagging() {
		if(age < 10) {
			System.out.println(name + "(이)가 꼬리를 흔듭니다.");
		} else {
			System.out.println("힘들어서 꼬리 못돌려요.");
		}
		age++;
	}
	
	
}
