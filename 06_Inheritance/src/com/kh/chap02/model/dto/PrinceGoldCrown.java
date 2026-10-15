package com.kh.chap02.model.dto;

// 상속 키워드 - extends 상속하는 클래스명
public class PrinceGoldCrown extends Treasure {
	private String source;

	public PrinceGoldCrown() {
		super(); // 모든 기본 - 부모클래스 기본생성자 호출 구문
		System.out.println("자식 클래스");
	}

	public PrinceGoldCrown(String source) {
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
