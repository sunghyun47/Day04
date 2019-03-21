package com.google.array1;

import java.util.Scanner;

public class ArrayTest_1 {

	public static void main(String[] args) {

		System.out.println("Array Test");
		
		//배열
		//여러데이터의 묶음
		//하나의 변수로 여러데이터를 다루고자 할때
		//같은 데이터만 묶을수 있음
		//배열 생성 시 몇개를 만들지 미리 생성
		//만들어진 배열의 크기는 수정 불가

		//메모리 영역
		//static, stack, hip
		//main 메서드가 차지하는 영역이 stack
		
		//배열 선언하는 방법2가지(변수 선언이랑 동일)
		//1. 모을 데이터타입 변수명 [];
		//2. 모을 데이터타입 [] 변수명;
		
		int a = 10;
		int b = 20;
		
		int [] ar2 = new int[2]; // 몇개만들지 미리 생성->2개
		ar2[0] = a;
		ar2[1] = b;
		
		//정수형데이터
		int [] ar = new int[3];
		System.out.println(ar);
		ar[0]='a'; // 97 출력
		ar[1]=20; //인덱스번호를 사용
		ar[2]=(int)3.2; //강제형변환 3 출력
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println("---------");

		
		// 문자 5개 담을 배열 선언하고
		// 각각 문자 입력후 출력
		
		char [] ch = new char[5];
		ch[0]='a';
		ch[1]='b';
		
		int [] num; //변수 선언
		num = new int[3]; // 지역변수 초기화
		System.out.println(num);
		System.out.println(num[0]);
		
		Scanner sc = new Scanner(System.in); //sc는 래퍼런스 타입이면서 스캐너타입
		Scanner sc2 = new Scanner(System.in); 
		Scanner sc3 = new Scanner(System.in); 
		
		Scanner [] scs = new Scanner[3];
		scs[0] = sc;
		scs[1] = sc2;
		scs[2] = sc3;
		
		
		
		
		
		/*
		String [] ar1 = new String[5];
		ar1[0] = "가";
		ar1[1] = "나";
		ar1[2] = "다";
		ar1[3] = "라";
		ar1[4] = "마";
		
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		*/
		
		
		
		
		
		
		
	}

}
