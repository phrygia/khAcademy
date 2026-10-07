package kh.loop;

import java.util.Iterator;
import java.util.Scanner;


// 반복문
public class LoopFor {
	public void method0() {
		/*
		 * for (;;) { System.out.println("꼭 3개 적어야하는 것은 아님"); }
		 */
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1 + "번 반복");
		}
	}
	
	public void method1() {
		for (int j = 1; j <=3; j++) {
			System.out.println(j);
		}
	}
	
	
	
	public void gugudan() {
		// 이번주 목표 - 내일까지 배열 끝내기
		
		// 구구단 출력 프로그램
		// 사용자 정수 입력받기
		// 입력받은 정수의 단 출력해보기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 외자");
		System.out.print("몇 단을 출력하시겠어요 > ");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다.");
		
		System.out.println(dan + " X 1 =" );
	}
}


