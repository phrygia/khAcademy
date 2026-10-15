package com.kh.chap03.model.dto;

public class Coffee extends Beverage {
	private String beanOrigin; // 원두 원산지

	public Coffee() {}

	public Coffee(String name, String volume, String color, String coffeeBean) {
		super(name, volume, color);
		this.beanOrigin = coffeeBean;
	}

	public String getCoffeeBean() {
		return beanOrigin;
	}

	public void setCoffeeBean(String coffeeBean) {
		this.beanOrigin = coffeeBean;
	}
	
	
}
