package kh;
import java.util.Scanner;

public class ConditionSwitch {
	
	// 메모리 스택 > 메서드 영역에 정보 올라감 
	public void method0 () {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층 가세요?(B1 / B2 / B3) >");
		String floor = sc.nextLine();
		
		switch(floor) {
			case "B1" : System.out.println("지하 1층입니다."); break;
			case "B2" : System.out.println("지하 2층입니다."); break;
			case "B3" : System.out.println("지하 3층입니다."); 
		}
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 >2 ");
		int menuNo = sc.nextInt();
		
		// 1번 : 1000원, 2: 500, 3:4000, 4:1000
		/*int price = menuNo == 1 ? 1000
					: menuNo == 2 ? 500
					: menuNo == 3 ? 4000
					: 0;*/
		
		// 모던 스위치
		int price = switch(menuNo) {
			case 1,4 -> 1000;
			case 2 -> 500;
			case 3 -> 4000;
			default -> 0;
		};
		
		System.out.println(menuNo + "번 메뉴는 " + price + "원 입니다.");
	}

	public void method2() {
		int num = 1;
		switch(num) {
			case 1 : System.out.println("1입니다."); break;
			case 2 : System.out.println("입니다"); break;
			default : System.out.println("없어요.."); 
		}
	}
}

