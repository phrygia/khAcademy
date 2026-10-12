package com.kh.chap01.abstraction.run;
import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Character;

public class MapleStory {
	public static void main(String[] args) {
		System.out.println("메이플 스토리 시~작!");
		
		// 객체생성 
		Character c = new Character();
		c.nickname = "프리지아";
		System.out.println("캐릭터명 " + c.nickname);
		
		// 스캐너 타입의 변수 선언 - sc는 주소값
		Scanner sc = new Scanner(System.in);
		System.out.println("캐릭터의 닉네임을 입력해주세요. > ");
		
		// 주소값 참조를 한다.
		// c.nickname: 값을 저장할 수 있는 공간 = 
		c.nickname = sc.nextLine(); 
		System.out.println("캐릭터의 직업을 입력해주세요. (히어로, 아크메이지, 보우마스터) > ");
		c.job = sc.nextLine(); // c를 참조해서 job 필드에 저장
		System.out.println("헤어스타일을 입력해주세요. > ");
		c.hairStyle = sc.nextLine();
		
		while(true) {
			System.out.println();
			// 캐릭터라는 타입의 객체의 닉네임 필드에 
			System.out.println(c.nickname + "의 정보!");
			System.out.println("직업 : " + c.job);
			System.out.println("헤어스타일 : " + c.hairStyle);
			
			System.out.println("레벨 : " + c.level);
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.println("1. ?? / 2.?? /3. 프로그램 종료");
			
			// 스캐너의 주소값을 참조하고 
			int menuNo = sc.nextInt();
//			sc.nextLine();
			
			switch(menuNo) {
				case 1: c.attack(); break; // 객체의 주소를 참조해서 메서드를 호출
				case 2: c.jump(); break;
				case 3: return; // 나를 부른곳으로 감 - main, 종료
			}
		}
	}
}
