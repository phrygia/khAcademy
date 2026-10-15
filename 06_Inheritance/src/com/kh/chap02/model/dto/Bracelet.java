package com.kh.chap02.model.dto;


public class Bracelet extends Treasure {
	// 부모로부터 상속받는 부분은 작성하지 않는다.
	private double perimeter; // 지름

	public Bracelet() {}

	public Bracelet(String name, double weight, double perimeter) {
		super(name, weight); // 부모클래스의 매개변수 생성자를 호출한다.
		this.perimeter = perimeter;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	// 메소드 상속받았지만 다시 쓰고 싶을때 - 같은 이름으로 
	public String info() {
		return super.info() + ", 지름: " + perimeter;
	}
}
