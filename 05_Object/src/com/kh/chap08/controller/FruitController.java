package com.kh.chap08.controller;
import com.kh.chap08.model.dto.Fruit;
import com.kh.chap08.model.service.FruitService;

public class FruitController { //view와 service의 중간역할
	private FruitService fs = new FruitService();
	
	public void saveFruit(String name, String speices) {
//		System.out.println("view로 부터 전달받은 name :" + name);
//		System.out.println("view로 부터 전달받은 speices :" + speices);
		
		// 과일모양으로 가공 - 생성자 인자값으로 전달
		Fruit f = new Fruit(name, speices); // fruit 매개변수 생성자 호출
		// service 객체생성
		fs.saveFruit(f);
	}
	
	// 게터
	public Fruit[] findFruit() { // void - 리턴자료의 타입으로 바꿈
		return fs.findFruit(); // 매모리 스택에 올라간다.
		// fruits형 배열의 주소값 반환
	}
	
	public void fertilize() {
		fs.fertilize();
	}
	
	public void harvest() {
		fs.harvest();
	}
}
