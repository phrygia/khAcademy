package com.kh.chap01.abstraction.model.vo;

// 자동차 운전하기 
public class CarDrive {
	
	/* 자동차 종류
	 * 
	 * 차종 - car type
	 * 속도 - speed
	 * 색상 - car color
	 * 
	 * 가속하다 - accelerate
	 * 감속하다 - decelerate 
	 * 정지하기 - stopCar 
	*/
	public String type;
	public int speed;
	public String color;
	
	// 기본생성자
	public CarDrive() {}
	public CarDrive(String type, int speed, String color) {
		this.type = type;
		this.speed = speed;
		this.color = color;
	}
	
	public void accelerate() {
		System.out.println(color + "색 자동차가 스피드를 올립니다~~!!!");
		speed++;
	}
	
	public void decelerate() {
		if(speed > 0) {
			System.out.println(color + "색 자동차가 스피드를 내립니다~~!!!");
			speed--;
		} else {
			System.out.println("차량이 멈췄습니다.");
		}
	}
	
	public void stopCar() {
		System.out.println(color + "색 " + type + " 자동차가 차량이 멈췄습니다.");
		speed = 0;
	}
	
	
}
