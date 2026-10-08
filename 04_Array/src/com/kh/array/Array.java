package com.kh.array;
import java.util.Arrays;


public class Array {
	// 변수 (Variable)
	// 메모리(RAM)
	
	public void method0 () {
		int num1 = 15;
		int num2 = 19;
		int num3 = 33;
		int num4 = 22;
		int num5 = 5;
		System.out.println("ddd");
		
		int sum = 0;
		for(int i = 1; i <=5; i++) {
//			sum += 
		}
	}
	
	public void method1 () {
		// 1. 배열 선언
		/*
		 * int[] nums; // = {15,19,33,22,5}; double[] d; char[] c; String[] s; boolean[]
		 * b;
		 */
		
		// 2. 배열 할당
//		배열에 몇개의 값이 들어갈 것인지 배열의 크기를 정해주는 과정
//		int[] nums; <-- 배열 선언
//		nums = new int[3]; <-- 할당 (칸수)
//		int[] arr = new int[3]; <-- 선언과 동시에 할당
		
		// int 1칸 = 4bite,
		int[] nums = new int[3];
//		System.out.println(nums);
		
		nums[0] = 10;
		nums[1] = 21;
		nums[2] = 30;
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 
	}
	
	public void method2 () {
		// 1. 배열 선언 및 할당
		int[] nums = new int[3]; // heap에 올라감 - 기본값 존재
//		int i; // 지역변수 - stack에 올라감 - 값 초기화 필요
		
//		System.out.println(i);
//		System.out.println(nums[0]);
		
		int number1 = 3;
		int number2 = 3;
//		System.out.println(number1 == number2);

		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());
		System.out.println(nums1.length);
	}
	
	public void method3 () {
		int[] nums = new int[3];
		nums[0] = 77;
		nums[1] = 66;
		nums[2] = 55;		
//		System.out.println("후후");
//		nums[3] = 1; // 스택트레이스 - 인덱스 범위를 벗어나면 에러남 
//		System.out.println(nums);
		
//		System.out.printf("%d, %d, %d\n", nums[0], nums[1], nums[2]);
		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
		}
		// 배열의 요소전체 출력 메서드
		System.out.println(Arrays.toString(nums));
	}
	
	public void method4 () {
		// 배열 사용용도 - 사용해야 하는 값과 개수가 명확한 경우에만 사용
		int[] arr = {100, 200, 300, 400, 500, 600};
		System.out.println(Arrays.toString(arr));
	}
	
	// ★ 기억하기
	public void method5 () {
		char[] addiction = new char[2];
		addiction[0] = '중';
		addiction[1] = '독';
		System.out.println(Arrays.toString(addiction));
		
		addiction = new char[3];
		addiction[2] = '성';
		System.out.println(Arrays.toString(addiction));
		
		// 차(char)형 배열 = 차형배열의 주소값
		// 가비지 컬렉터
		addiction = null; // 값이 없음
		System.out.println(addiction);	
	}
	
	public void method6 () {
		// 복사 
		
		// 얕은 복사
		int[] origin = {1,2,3};
		System.out.println(Arrays.toString(origin));
		
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		
		
	}
	
	public void method7 () {
		// 깊은 복사
		int[] origin = {1,2,3};
		int[] copy = new int[6];
		
		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2];
		 */
		
//		for (int i = 0; i < copy.length; i++) {
//			copy[i] = origin[i];
//		}
		
//		System.out.println(Arrays.toString(copy));
		
		int[] copy2 = new int[10];
		System.arraycopy(origin, 0, copy2, 0, 3);
		System.out.println(Arrays.toString(copy2));
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 =origin.clone();
		System.out.println(Arrays.toString(copy4));
	}
}








