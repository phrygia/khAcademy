package com.kh.chap04.view;
import com.kh.chap04.controller.FieldController;

public class FieldView {
	public void check() {
		FieldController fc = new FieldController();
		// 1. FieldController라는 자료형으로 fc라는 식별자를 가진 지역변수를 선언
		// 2. 객체 생성 (new 키워드) -> global 멤버변수 할당.
		// 3. 생성된 객체의 주소값을 대입
		System.out.println(fc.global);
		
		// 값을 전달한다.
		fc.checkVariable(10); // checkVariable 호출 => 파라미터(매개변수) 초기화
		// 호출종료: local, parameter가 소멸한다. 
		
		System.out.println(fc.global);
		fc = null;
//		System.out.println(fc.global);
		
		System.out.println(fc.str);
	} 
}
