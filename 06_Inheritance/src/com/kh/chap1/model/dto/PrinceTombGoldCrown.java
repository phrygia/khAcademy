package com.kh.chap1.model.dto;

public class PrinceTombGoldCrown {
	private String name;
	private double weight; // 무게
	private String source; // 출처

	
	// 1. 기본 생성자
	// 단축키: Alt+shift+S → o (Generate Constructor using Fields) →  Alt + d(체크 해제) → Alt+g
	public PrinceTombGoldCrown() {}
	
	// 2. 모든 필드를 매개변수를 갖는 생성자 
	// 단축키: Alt+shift+S → Alt+g
	public PrinceTombGoldCrown(String name, double weight, String source) {
		this.name = name;
		this.weight = weight;
		this.source = source;
	}
	
	// 메서드부 - getter, setter
	// 단축키 : Alt + shift + s → r(Generate Getter and Setters) → Alt + a (전체선택) → Alt + r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	public String info() {
		return "보물정보 = [보물명: " + name + ", 무게: " + weight + ", 출처: " + source + "]";
	}
	
}

