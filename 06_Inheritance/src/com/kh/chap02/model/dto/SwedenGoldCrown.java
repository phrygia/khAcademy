package com.kh.chap02.model.dto;

// 같은 패키지라면 import 안해도됨
public class SwedenGoldCrown extends Treasure {
	private double purity; // 순도

	public SwedenGoldCrown() {}

	public SwedenGoldCrown(String name, double weight, double purity) {
		// super.name = name; // 캡슐화원칙 위반! private name
//		setName(name);
//		setWeight(weight);
		super(name, weight);
		this.purity = purity;
	}

	public double getPurity() {
		return purity;
	}

	public void setPurity(double purity) {
		this.purity = purity;
	}

	
}
