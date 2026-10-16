package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.service.BlackBeanSauceNoodles;
import com.kh.chap03.service.DeliveryService;
import com.kh.chap03.service.EeightZeroRestaurant;
import com.kh.chap03.service.HongChineseRestaurant;

public class Run {
	public static void main(String[] args) {
//		blackBeanSauceNoddles 
		
		// 짜장면 시키기 프로그램
		System.out.println("짜장면 주문 서비스에 오신것을 환영합니다.");
		System.out.println("주문하실 중국집을 선택하시기 바랍니다.");
		System.out.println("1. 홍반점");
		System.out.println("2. 청반점");
		System.out.println("메뉴를 선택해주세요 > ");
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		BlackBeanSauceNoodles bbsn = null;
		DeliveryService d = null;
		// 짜장면 만드는 기능
		
		switch(menuNo) {
			case 1 : bbsn = new HongChineseRestaurant(); 
					d = new HongChineseRestaurant(); break;
			case 2 : bbsn = new EeightZeroRestaurant();
					d = new EeightZeroRestaurant();break;
		}
		
		bbsn.makeNoodles();
		d.delivery();
		
		
	}
}
