package com.kh.chap04.run;

import com.kh.chap04.view.FieldView;

public class Run {
	// 메인메서드는 Run 객체를 생성하지 않고 호출할 수있는가?
	public static void main(String[] args) {
		new FieldView().check();
	}
}
