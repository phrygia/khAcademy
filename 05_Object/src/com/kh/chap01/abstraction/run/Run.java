package com.kh.chap01.abstraction.run;
import com.kh.chap01.abstraction.model.vo.Dog;

public class Run {
	public static void main(String[] args) {
		// 현실개 -> 자바 개
		
		// 객체생성=실체화
		Dog dog = new Dog(); // 공간 (자료형) = 주소값 
		dog.walk(); // 참조연산자 .
		dog.name = "나폴레옹";
		System.out.println(dog.name);
		
		Dog khan = new Dog();
		khan.name = "징기스칸";
		System.out.println(khan.name);
		
		// 클래스: 객체가 가지는 정보들을 담아내는 그릇/틀/설계도/명세
		// 사용자 정의 자료형
		dog.walk();
		khan.walk();
		dog.age = 6;
		System.out.println(dog.age);
		
		dog.tailWagging();
		System.out.println(dog.age);
		
		//
	}
}

