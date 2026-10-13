package com.kh.chap05.model.dto;

public class Member {
	private String userId;
	private String userPw;
	private String nickName;
	// 생성자 => 이제 배울 것
	
	// 메소드
	// getter, setter, info => 만들기 시작
	
	// 생성자 - 기본, 매개변수 생성자 2개 만들기
	// 기본생성자 - 매개변수가 없는 생성자
	public Member() {
//		System.out.println("생성자 호출");
	}
	
	public Member(String userId) {
		System.out.println("아이디 값 초기화~");
		this.userId = userId;
	}
	
	public Member(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	// 매개변수 생성자 
	public Member(String userId, String userPw, String nickName) {
		this.userId = userId;
		this.userPw = userPw;
		this.nickName = nickName;
	}
	
	/*
	 * 1. 생성자는 반드시 클래스 명과 동일해야함! 
	 * 2. 반환형이 존재해선 안됨
	 * 
	 * */
	
	
	// setter
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
	// getter
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getNickName() {
		return nickName;
	}
	
	public String info() {
		String info = "멤버 = [id : " + userId + ", password : " + userPw + ", nickname : " + nickName + "]";
		return info;
	}
}

