package kh.loop;

import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


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
		/*
		 * System.out.println(dan + " X 1 =" + (dan *1)); System.out.println(dan +
		 * " X 2 =" + (dan *2)); System.out.println(dan + " X 3 =" + (dan *3));
		 * System.out.println(dan + " X 4 =" + (dan *4)); System.out.println(dan +
		 * " X 5 =" + (dan *5)); System.out.println(dan + " X 6 =" + (dan *6));
		 * System.out.println(dan + " X 7 =" + (dan *7)); System.out.println(dan +
		 * " X 8 =" + (dan *8)); System.out.println(dan + " X 9 =" + (dan *9));
		 */
		/*
		 * for (int i = 0; i <= 9; i++) { System.out.println(dan + " X " + i + " = " +
		 * (dan * i)); }
		 */
		String gugudan = IntStream.rangeClosed(1, 9)
				.mapToObj(i -> "%d X %d = %d".formatted(dan, i ,dan * i))
				.collect(Collectors.joining("/n"));
		System.out.println(gugudan);
	}
}


