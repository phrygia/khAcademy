package com.kh.chap03.run;

import com.kh.chap03.model.dto.Beverage;
import com.kh.chap03.model.dto.Coffee;
import com.kh.chap03.model.dto.Juice;
import com.kh.chap03.model.dto.Water;

public class Run {

	public static void main(String[] args) {
		Beverage b = new Beverage("마실거", "300ML", "검은색"); 
		System.out.println(b.info());
		Water w = new Water("삼다수", "500ML", "투명", "한라산");
		System.out.println(w.info());
		Coffee c = new Coffee("카페라떼", "1L" ,"갈색", "에티오피아");
		System.out.println(c.info());
	
		
		System.out.println(b); // 참조자료형 b 호출 - 결과: 특정 메서드의 반환값 - toString메서드
		System.out.println(b.toString()); // Object가 가진 멤버함수 호출
		// toString: 해당 객체의 FullClassName + @ + 메모리 주소값을 기반으로 만든 10진수를 16진수 형태로 변경한 문자열
		
		System.out.println("--------------");
		System.out.println(c);
		System.out.println(w);
		
		System.out.println("--------------");
		Juice j = new Juice("델몬트 오렌지 쥬스", 5000);
		System.out.println(j);
		
	}

}
