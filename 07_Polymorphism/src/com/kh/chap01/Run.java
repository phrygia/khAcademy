package com.kh.chap01;

public class Run {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.printParent();
		
		Child1 c1 = new Child1(); // UpCasting
		c1.printParent();
		c1.printChild1();
		
		// 왼쪽 = 오른쪽     같은 자료형이여야 한다.
		Parent p2 = (Parent)new Child1(); // child는 Parent 타입
		p2.printParent();
//		p2.printChild1(); // 타입이 Parent가 되서 메서드 호출 불가
		
		
//		상속이란? 부모클래스의 타입을 받아서 사용할 수 있다.
//		필드 / 메소드 -> 안중요함
//		상속을 통해 부모클래스로부터 상속받을 수 있는 가장 중요한 것은?
//		=> 타입(자료형)
//		객체들간의 관계를 구축하는 방법, 계층 형성
		
		((Child1)p2).printChild1(); // DownCasting
		p2.printParent();
		
		/**
		 * 클래스 형 변환 - 상속구조, 
		 * 1. UpCasting: 자식->부모
		 * 2. DownCasting: 
		 */
		
		// Parent타입을 상속받았기 때문에 Parent타입의 배열을 사용할 수 있다. - 부모 타입 자료형으로 바꿀 수 있다.
//		원래라면 Child1, Child2 타입이기때문에 2개를 선언해야함
		Parent[] arr = {new Child1(), new Child1(), new Child2(), new Child2()};
		for (int i = 0; i < arr.length; i++) {
			arr[i].print(); // 동적 바인딩 
		}
		
		
	}
}
