package com.kh.chap05.run;

import com.kh.chap05.model.dto.Member;

public class Run {
	public static void main(String[] args) {
		// 생성자
		
		// 멤버객체가 생성됨 -> 회원가입이 발생
		Member member = new Member(); 
		// new: 객채생성    Member: 생성자(초기화)
		// 1. 힙에 덩어리 생성, 필드 전부 기본값
		// 2. 생성자 실행 
		// 3. 참조값 반환
		System.out.println(member.info());
		
		Member member1 = new Member("user01");
		System.out.println(member1.info());
		
		
//		member.setUserId("test@gmail.com");
//		member.setUserPw("dajsdlajdlkajdkadjald");
//		member.setNickName("phrygia");
//		
		Member member2 = new Member("user02", "pass02");
		System.out.println(member2.info());
//		
		Member member3 = new Member("user03", "pass03", "dasdasdad");
		System.out.println(member3.info());
	}
}
