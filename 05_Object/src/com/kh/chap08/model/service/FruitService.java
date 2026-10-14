package com.kh.chap08.model.service;
import java.util.Iterator;

import com.kh.chap08.model.dto.Fruit;

// 연산, 계산, 저장 - 비즈니스로직
// setter의 역할 
public class FruitService {
//	private Fruit fruit; // 과일 정보 저장하는 공간이 하나이기 때문에 단일값만 저장
//	private Fruit seoncdFruit;
//	private Fruit thirdFruit;
	private Fruit[] fruits = new Fruit[10]; // 객체배열
	
	public void saveFruit(Fruit f) {
		// this참조연산자 필드명 (=)대입연산자 벨류값;
		/*
		 * if(fruit == null) { this.fruit = f; } else if(seoncdFruit == null) {
		 * this.seoncdFruit = f; } else if (thirdFruit == null) { // 경우의 수
		 * this.thirdFruit = f; }
		 */
		
		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i] == null) {
				fruits[i] = f; // 컨트롤러의 주소값 - stack이 날라가면 
				return;
			}
		}
	}
	
	public Fruit[] findFruit() {
//		return fruit; // 반환 자료
		// 빈 과일이 하나라도 존재한다면 null 반환
		
		// null 체크 먼저하기
		/*
		 * if(fruit== null || seoncdFruit == null || thirdFruit == null) { return null;
		 * } else if(fruit != null) { return fruit; } else if(seoncdFruit != null) {
		 * return seoncdFruit; } else if(thirdFruit != null) { return thirdFruit; }
		 */
	
		/*
		 * return fruit != null ? fruit: seoncdFruit != null ? seoncdFruit: thirdFruit
		 * != null ? thirdFruit:null;
		 */
		
		
		return fruits;
	}
	
	
	
	public void fertilize() {
		// 당도 1
//		당도 필드 과일 주소 -> fruit
//		주소 아니까 > 당도 올리기 > setBrix();
		/*
		 * if(fruit!= null) { fruit.setBirx(fruit.getBrix() + 1); } else { //
		 * System.out.println("과일 없어요"); 출력문 - view화면에서 담당해야 하는 부분이라 여기 쓰면 안됨
		 * 
		 * }
		 */
//		fruit.setBirx(fruit.getBrix() + 1);
	}
	
	public void harvest() {
		// 식물뽑기
//		fruit = null;
	}
}

