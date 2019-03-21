package com.google.array1;

import java.util.Scanner;

public class ArrayTest_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 학생수 입력
		// 입력한 수만큼 학생의 이름 입력
		// 내가 입력한 학생수만큼 이름 출력
		
		System.out.println("학생수를 입력하세요");
		
		int count = sc.nextInt(); // 숫자받기
		String [] names = new String [count];
		for(int i=0; i<names.length; i++) {
			System.out.println(i+1+" 번째 이름 입력");
			names[i] = sc.next(); // 학생데이터
		}
		int [] kors = new int[names.length];
		int [] mat = new int[names.length];
		
		for(int i=0; i<kors.length; i++) {
			System.out.println(i+1+" 번째 이름 입력");
			kors[i] = sc.nextInt(); // 학생데이터
		}
		
		for(int i=0; i<mat.length; i++) {
			System.out.println(i+1+" 번째 이름 입력");
			mat[i] = sc.nextInt(); // 학생데이터
		}
		
		int kTotal = 0;
		int mTotal = 0;
		
		for(int i=0; i<names.length; i++) {
			kTotal = kTotal+kors[i];
			mTotal = mTotal+mat[i];
		}
		System.out.println("kor : " + kTotal/names.length);
		System.out.println("mat : " + mTotal/names.length);
		// 학생수 만큼 국어접수 입력
		// 가 학생 국어점수 입력
		// 나 학생 국어점수 입력
		// 가 : 82
		// 나 : 62
		
		//국어점수 반평균
		//수학점수 반평균
		
		// 국어점수를 학생수만큼 모아놔야됨 (정수형배열)
		for(int i=0; i<kors.length;i++ ) { //names.length 써도 상관없음
			System.out.println(names[i] + "학생의 점수");
			kors[i] = sc.nextInt();
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i] + " : " +kors[i]);
		}
		
	}

}
