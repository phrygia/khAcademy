package com.kh.chap08.model.dto;

// 과일의 정보를 저장하기 위한 클래스
public class Fruit {
	// 과일명, 품종, 
	private String name;
	private String species;
	private int brix; // 당도
	
	public Fruit(String name, String species) {
		this.name = name;
		this.species = species;
		this.brix = (int)(Math.random() * 25) + 1;
	}

	// getter, setter
	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}
	public int getBrix() {
		return brix;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public void setBirx(int brix) {
		this.brix = brix;
	}
	public String info() {
		return "과일의 정보 = [이름 : "+ name + ", 품종 : " + species + ", 당도 : " + brix + "]"; 
	}
		
}
