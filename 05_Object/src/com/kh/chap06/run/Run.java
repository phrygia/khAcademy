package com.kh.chap06.run;
import com.kh.chap06.controller.MethodController;

public class Run {

	public static void main(String[] args) {
		MethodController m1 = new MethodController();
		int a = m1.add(2, 3);
		int b = m1.add(3, 5);
//		System.out.println(a);
//		System.out.println(b);
	
		m1.method();
		m1.method(1);
		m1.method(1,2);
	}

}
