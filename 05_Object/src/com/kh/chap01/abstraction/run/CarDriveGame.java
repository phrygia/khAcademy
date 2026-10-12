package com.kh.chap01.abstraction.run;
import java.util.Scanner;
import com.kh.chap01.abstraction.model.vo.CarDrive;

public class CarDriveGame {
	public static void main(String[] args) {
		CarDrive car = new CarDrive();
		System.out.println("자동차 드라이브 게임 시작");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차의 타입을 입력해주세요. (suv, 스포츠카, 경차) > ");
		car.type = sc.nextLine(); 
		
		System.out.println("자동차의 색상을 입력해주세요. > ");
		car.color = sc.nextLine(); 
		
		while(true) {
			System.out.println();
			System.out.println("자동차의 타입 : " + car.type);
			System.out.println("자동차의 색상 : " + car.color);
			System.out.println("자동차의 속도 : " + car.speed);
			System.out.println();
			
			System.out.println("차량을 운행해주세요 > ");
			System.out.println("1. 가속하기 / 2.감속하기 / 3.정지하기 / 4. 운행 종료");
			
			int carSpeed = sc.nextInt();
			
			switch(carSpeed) {
				case 1: car.accelerate(); break;
				case 2: car.decelerate(); break;
				case 3: car.stopCar(); break;
				case 4: return; 
			}
		}
	}
}



