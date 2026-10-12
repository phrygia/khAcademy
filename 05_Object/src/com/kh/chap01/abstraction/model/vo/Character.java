package com.kh.chap01.abstraction.model.vo;

// 메이플 스토리 캐릭터 구현
public class Character {
	// 접근제한자
	public String nickname;
	public int level;
	public String job;
	public String hairStyle;
	
	public void jump() {
		System.out.println(nickname + "이(가) 점프합니다.");
		level--;
	}
	public void attack() {
		System.out.println(nickname + "이(가) 공격합니다.");
		level++;
	}
}
