package com.kh.chap03.model.dto;
// dto: 값을 전송하는데 객체

public class Juice {
	private String name;
	private int price;

	public Juice() {
//		super();
	}

	public Juice(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override // 애노테이션
	public String toString() {
		return "주스의 정보 = 이름: "+ name 
				+ ", 가격: " + price;
	}
}
