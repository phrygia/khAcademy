package kh.loop;

import java.util.Random;
import java.util.Scanner;

public class LoopWhile {
	public void method0() {
		// 초기식, 조건식, 증감식
		int i = 0;
		while(i < 3) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method1() {
		while(true) {
//			System.out.println("무한 반복 느낌");
		}
	}
	
	public void method2() {
//		System.out.println(1+2+3+4+5);
		
		// 무지성 반복문 => 불가능
		// 조건 => 무지성 if문 가능
		
		
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			// 증감식
			i++;
		}
		
		System.out.println(sum);
	}
	
	public void generateLottoNumber() {
		// 1~45 >= 6개 맞추기
		
//		Math math = new Math(); // - double 리터럴
//		int number = (int) Math.random(); 
//		System.out.println(Math.random() * 100);
		
		//0.35887736917527113 => double
		// 2단계 => 10을 곱한 결과를 int형으로 강제형변환
//		System.out.println((int)(number * 10));
		
//		System.out.println((int)(number * 10) + 1);
		
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.printf("오늘의 운세 ~ %d, %d, %d, %d, %d, %d",
				num1, num2, num3, num4, num5, num6);
	}
	
	// 탈출문
	public void method4() {
		// 무한 반복 돌리기
		// 매번 문자열 입력받기
		// 입력받은 문자열 길이 출력
		// 조건: 입력문자열 'exit'면 반복 종료
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("글자수 체크(그만하고 싶으시면 exit을 입력하세요) > ");
			String keyword = sc.nextLine();
			System.out.println(keyword + "은(는) " + keyword.length() + "글자입니다.");
			
			// 동등비교 (문자열-문자열)
			if(keyword.equals("exit")) {
//				break; // while문 벗어남 - 내가 속한 상위 스코프 
				return; // method 블록을 벗어남
			}
		}
		
//		System.out.println("다음에 또 만나요~");
	}
	
	
	public void checkId() {
		// continue;
		
		System.out.println("회원가입 서비스입니다.");
		Scanner sc = new Scanner(System.in);
		
		// 아이디 입력받기
		// 사용자가 입력한 아이디가 10글자가 넘는다? > 재입력
		// 안넘으면 > 다음파트로
		
		while(true) {
			System.out.println("아이디를 입력해주세요(10글자를 넘기지 말아주세요) >");
			String userId = sc.nextLine();
			
			// 대소비교 연산
			if(10 < userId.length()) {
				System.out.println("아이디 10글자 이하만 사용 가능합니다.");
				continue;
			} 
			System.out.println("사용 가능한 아이디입니다.");
			break;
		}
		System.out.println("비밀번호를 입력해보세요.");
	}
}



