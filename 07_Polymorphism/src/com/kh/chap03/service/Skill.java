package com.kh.chap03.service;

public interface Skill { // 계약서
	int num = 1;
	// 명세 - 이 계약서에 서명을 하는 순간 계약서에 명시된 모든 사항을 수행해야함
//	이 인터페이스를 구현하는 클래스는 반드시 명시된 모든 메소드를 구현해야함
	void delivery();
}
