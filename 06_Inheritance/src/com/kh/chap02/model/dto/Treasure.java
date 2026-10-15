package com.kh.chap02.model.dto;

/*
 * 상속
 * 기존에 존재하는 클래스를 이용해서 새로운 클래스를 만드는 기술
 * */

public class Treasure { // 상속구현
	// 공통 필드
	private String name;
	private double weight;
	
	// 기본생성자
	public Treasure() {
		System.out.println("부모 클래스");
	}
	
	// 매개변수 생성자
	public Treasure(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	// getter ,setter
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
	
	// info
	public String info() {
		return "보물명: " + name + ", 무게: " + weight;
	}
}
