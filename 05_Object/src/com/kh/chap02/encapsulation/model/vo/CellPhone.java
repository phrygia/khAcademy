package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메서드부
// 셀폰 자료형 만들
public class CellPhone {
	/* 필드 : 값을 담는 공간 
	 * 객체들이 가져야할 공통적인 속성
	 * 접근제한자
	 * */
	
	// 제품명, 통신사, 사이즈, 색상
	private String productName;
	private String networkProvider;
	private double size;
	private String color;
	
	// 객체의 속성 값을 기록 및 수정하는 기능의 메서드 : setter()
	/* 
	 * VO -> setter 메소드를 구현하지 않음 
	 * DTO (Data Transfer Object)
	 * 
	 * setter 규칙
	 * */
	
	// size 필드의 값을 세팅
	public void setSize (double size) { // size 변수 선언 - 지역변수, 파라미터, 매개변수 
		// 매개변수 - 호출 시 초기화가 강제됨 (값 필수)
		// 지역변수 - 초기화해야 함
//		System.out.println(size);
		
		// 객체 내부에서 this라는 키워드는 해당 객체 자기자신의 주소값을 가리킴
		System.out.println("setSize 35행" + this);
		
		if(size > 0.0) {
			// ★ scope 안에서는 해당 영역안에 있는 지역변수가 식별자 우선권을 가짐 
			this.size = size;
		} else {
			System.out.println("올바르지 않은 사이즈 입니다.");
		}
	}
	
	// 데이터를 반환해주는 기능의 메소드 : getter() => 꼭 있어야함!
	// setter는 선택	
	public double getSize() {  // public 반환형(리턴타입) 메서드명() {}
		return size;
	}
	
	// productName 필드를 기록 및 수정할 수 있는 메서드 - 값을받아 필드에 세팅
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setNetworkProvider(String networkProvider) {
		this.networkProvider = networkProvider;
	}
	
	public String getNetworkProvider() {
		return networkProvider;
	}
	
	// return 타입은 하나여야 한다.
	public String info() {
		String info = "스마트폰 = [제품명 : " + productName 
				+ ", 색상 :" + color
				+ ", 사이즈 :" + size + "인치"
				+ ", 통신사 :" + networkProvider + "]";
			
		return info;
	}
}
