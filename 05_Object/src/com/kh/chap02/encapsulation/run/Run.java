package com.kh.chap02.encapsulation.run;
import com.kh.chap02.encapsulation.model.vo.CellPhone;

public class Run {

	public static void main(String[] args) {
		// 객체생성 - 변수선언(자료형 식별자 = 주소값)
		CellPhone cp = new CellPhone();
		
		//  heap의 객체의 필드 - cp 참조해서  
//		cp.productName = "아이폰 18 pro";
//		
//		// 주소값 참조
//		System.out.println(cp.productName);
//		
//		cp.size = 8.0;
//		System.out.println(cp.size);

		/* 캡슐화 */
		// 필드가 외부에서 보이지 않기 때문에 오류 발생 
		// 접근제한자 public -> private 직접 접근 불가능
		// 직접접근 X > 간접접근 
		// 클래스 내부 숨기기 => 정보은닉 (information hiding)
		
		// 메서드 호출 > stack에 올라감
		cp.setSize(4.0); // (4.0) 값: argument, 인자값, 인수
//		System.out.println("메인메소드 34행" + cp);
		
//		System.out.println(cp.getSize());
//		cp.getSize();
		
		/*
		 * cp.setColor("빨강"); System.out.println(cp.getColor());
		 * 
		 * cp.setNetworkProvider("net"); System.out.println(cp.getNetworkProvider());
		 * 
		 * cp.setProductName("뭘까?"); System.out.println(cp.getProductName());
		 */
		
		double size = cp.getSize();
		String name = cp.getProductName();
		String color = cp.getColor();
		String np = cp.getNetworkProvider();
		
		System.out.println(cp.info());
		
//		System.out.println("스마트폰 = [제품명 : " + name 
//					+ ", 색상 :" + color
//					+ ", 사이즈 :" + size + "인치"
//					+ ", 통신사 :" + np + "]"
//				);
		
;	}
}
