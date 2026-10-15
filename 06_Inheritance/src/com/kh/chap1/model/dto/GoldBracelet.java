package com.kh.chap1.model.dto;

public class GoldBracelet {
	private String name;
	private double weight; // 무게
	private double perimeter; // 지름
	
	public GoldBracelet() {}
	
	public GoldBracelet(String name, double weight, double perimeter) {
		this.name = name;
		this.weight = weight;
		this.perimeter = perimeter;
	}

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

	public double getDiameter() {
		return perimeter;
	}

	public void setDiameter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public String info() {
		return "보물정보 = [보물명: " + name + ", 무게: " + weight + ", 지름: " + perimeter + "]";
	}
}
