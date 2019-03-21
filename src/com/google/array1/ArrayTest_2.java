package com.google.array1;

import java.util.Scanner;

public class ArrayTest_2 {

	public static void main(String[] args) {

		// 정수 3개 모을 배열 선언 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 크기 입력");
		
		int count = sc.nextInt(); // 3넣으면 3칸 생성
		int [] ar = new int [count];
		
		//배열 생성시, 이미 데이터가 있는 경우
		
		int [] ar2 = {10,20,30}; // 3칸짜리배열 생성, 0번에 10
		System.out.println("검색할 번호 입력");
		count = sc.nextInt(); 
		
		// 1입력하면 : 20출력(ar2에서 1번 인덱스 출력)
		// 0입력하면 : 10출력
		
		System.out.println(ar2[count]);
		
		
		// length : 자기 배열의 크기(칸수,size)
		System.out.println(ar.length);
		
		
		
		
	}

}
