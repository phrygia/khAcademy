package kh;
import java.util.Scanner;

public class conditionElse {

	/* if ~ else if 문
	
	 */
	
	
	public void method2() {
		// 휴대폰 뒷자리 입력 - 1~3등 미당청 출력
		// 1-1234, 2-5678, 3-1111
		
		Scanner sc = new Scanner(System.in);
		System.out.println("핸드폰 번호 뒷자리를 입력해주세요 > ");
		
		// = 대입 연산자, . 
		String phoneNumber = sc.nextLine();
		System.out.println("사용자가 입력한 폰번호 : " + phoneNumber);
				
		// 동등비교 연산 => equals();
		if(phoneNumber.equals("1234") ) {
			System.out.println("1둥이예요~");
		} else if (phoneNumber.equals("5678")) {
			System.out.println("2둥이예요~");
		} else if (phoneNumber.equals("1111")) {
			System.out.println("3둥이예요~");		
		} else {
			System.out.println("다음기회에~");
		}
	}
	
	public void ageCheck() {
		// 사용자에게 나이(정수)를 입력받고 
		// 나이에 따라 다른 내용 출력.
		// 1~12: 어린이 입니다.
		// 13~17: 청소년
		// 18~ : 성인
		// 0, - : 잘못 입력하셨습니다.
		
		// 연산자 - 동등비교, 대소비교
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		
		int userAge = sc.nextInt();
		System.out.println("사용자가 입력한 나이 : " + userAge);
		
		/*
		 * if(1 <= userAge && userAge <= 12) { System.out.println("어린이 입니다~"); } else
		 * if(13 <= userAge && userAge <= 17) { System.out.println("청소년 입니다~"); } else
		 * if(18 <= userAge ) { System.out.println("성인 입니다~"); } else {
		 * System.out.println("잘못 입력하셨습니다."); }
		 */
		
		if(userAge <= 0) {
			System.out.println("올바른 나이를 입력하세요.");
		} else if(userAge >= 18  ) { 
			System.out.println("성인 입니다~"); 
		} else if( userAge <= 12) { 
			System.out.println("어린이 입니다~"); 
		} else {
			System.out.println("청소년 입니다~");
		}
		
		
	}

}


