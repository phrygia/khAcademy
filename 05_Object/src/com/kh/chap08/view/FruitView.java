package com.kh.chap08.view;
import java.util.Iterator;
import java.util.Scanner;
import com.kh.chap08.controller.FruitController;
import com.kh.chap08.model.dto.Fruit;

// 화면의 입출력 담당
public class FruitView {
	private Scanner sc = new Scanner(System.in);
	private FruitController fc = new FruitController();
	
	// 프로그램 시작 시 메인메뉴를 출력해주는 메소드	
	public void mainMunu() {
		while(true) {
			System.out.println("과수원 관리 프로그램입니다.");
			System.out.println("1. 과일심기");
			System.out.println("2. 과일정보확인하기");
			System.out.println("3. 비료주기");
			System.out.println("4. 과일수확하기");
			System.out.println("5. 종료하기");
			System.out.print("원하시는 메뉴를 선택해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
				case 1: savaFruit(); break;
				case 2: findFruit(); break;
				case 3: fertilize(); break;
				case 4: harvest(); break;
				case 5: System.out.println("프로그램을 종료하니다."); return;
				default: System.out.println("없는 메뉴를 선택했습니다.");
			}
		}
	}
	
	// 과일 심기 화면 출력 메서드 구현
	private void savaFruit() {
//		if(fc.findFruit() != null) { // 컨트롤러의 findFruit
//			System.out.println("과일이 존재합니다!");
//			System.out.println("먼저 과일을 재배해주세요.");
//			return;
//		} 
		
		System.out.println("과일명을 입력하시오 > ");
		String name = sc.nextLine();
		System.out.println("품종을 입력하시오 > ");
		String speices =  sc.nextLine();
		
		// 값 저장하기
		// 결합도 낮추기 - model과 view 사이에 중간다리 넣어주기(controller)
		// view 데이터 > controller 가공 > service로 넘김
		
		// 1. 컨트롤러가 메모리에 올라가 있어야 함 - 객체생성
		fc.saveFruit(name, speices);
	}
	
	// 과일 정보 출력 메서드 - 메서드 명은 같게 
	private void findFruit() {
		// 얕은복사. - 같은 주소값을 가짐 
		Fruit[] fruits = fc.findFruit(); 
		/*
		 * if(fruit != null) { // String info = fruit.info(); //
		 * System.out.println(info); } else { printFailMessage(); }
		 */
		/*
		 * if(fruits[0] != null) { System.out.println(fruits[0].info()); } if(fruits[1]
		 * != null) { System.out.println(fruits[1].info()); } if(fruits[2] != null) {
		 * System.out.println(fruits[2].info()); }
		 */
		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i] != null) {
				System.out.println(fruits[i].info());
			}
		}
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	private void fertilize() {
		if(fc.findFruit() != null) {
			fc.fertilize();
			System.out.println("비료로 인해 당도 1 증가");
		} else {
			printFailMessage();
		}
	}
	
	private void harvest() {
		// 설계
		if(fc.findFruit() != null) {
			// 수확 
			System.out.println("정말 수확을 하고 싶으신가요?");
			findFruit();
			System.out.println("수확을 원하신다면 수확하기를 입력하세요.");
			String answer = sc.nextLine();
			
			if(answer.equals("수확하기")) {
				fc.harvest();
			} else {
				System.out.println("메인메뉴로 돌아갑니다.");
			}
		} else {
			printFailMessage();
		}
	}
	
	private void printFailMessage() {
		System.out.println("아직 심은 과일이 없어요~");
		System.out.println("과일을 먼저 심어보세요~");
	}
}
