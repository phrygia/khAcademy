package com.kh.chap02.run;

import com.kh.chap02.model.dto.Cook;
import com.kh.chap02.model.dto.Event;
import com.kh.chap02.model.dto.Main;
import com.kh.chap02.model.dto.Salad;
import com.kh.chap02.model.factory.CookFactory;
import com.kh.chap02.model.fried.Fried;

public class Run {
	public static void main(String[] args) {
		Main m = new Main("조규철");
//		m.cooking();
		Salad s = new Salad("이승철");
//		s.cooking();
		
//		Cook c = new Cook("요리사"); // 추상클래스로 선언되었기때문에 객체 생성이 불가능
//		c.cooking();
		
		Cook[] c = {m,s,new Event("이벤트왕")}; // 다형성 적용
		for (int i = 0; i < c.length; i++) {
//			c[i].cooking();
		}
		
		// 의존적인 코드
//		JjamBbong jb = new JjamBbong(); // 짬뽕 클래스에 의존적인 코드
//		jb.makeJjamBbong(); 
//		Jajang jj = new Jajang();
//		jj.makeJajang();
		
		/*
		// 타입은닉
		Fried f = new FriedPork(); // 부모클래스에 의존하고 있기때문 
		f.fried(); // Fried 추상 클래스에 의존 
		
		f = new FriedRice();
		f.fried();
		*/
		
		CookFactory cf = new CookFactory(); // 1. 교체와 변경이 쉬워짐
		Fried f = cf.create(); // 2. 또 다른 Fried 타입을 추가하는것도 쉬워짐
		f.fried(); // CookFactory를 거치면 모두 다 같은 Fried로 취급
	}
}
