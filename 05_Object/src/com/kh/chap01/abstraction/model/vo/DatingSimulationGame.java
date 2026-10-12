package com.kh.chap01.abstraction.model.vo;

class DatingSimulationGame {
	// 성별, date() 호감도++, fight() 호감도--
	
	public String name;
	public char gendar; // F, M
	public int age; // 나이 
	public int likeability; // 호감도 
	public int happiness; // 행동도 
	
	public void date() {
		System.out.println("데이트를 시작합니다~");
		likeability++;
	}
	public void fight() {
		System.out.println("싸움을 시작합니다ㅋㅋㅋ");
		likeability--;
	}
	public void gift() {
		System.out.println("선물공세로 행복도가 상승합니다!!!");
		happiness++;
	}
	public void ignore() {
		System.out.println("무시당해서 행복도가 하락합니다. ㅜ");
		happiness--;
	}
}

