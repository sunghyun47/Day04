package com.google.array1;

import java.util.Scanner;

public class ArrayTest_6 {

	public static void main(String[] args) {

		// 1. 학생등록
			// 학생수를 입력
			// 학생수만큼
			// 학생 번호 입력
			// 학생 이름 입력
		 	// 학생 국어점수 입력
	 		// 학생 수학점수 입력
	 		// 학생 영어점수 입력
		
		// 2. 전체정보 조회
			// 번호,이름,국어,수학,영어
		// 3. 학생정보 검색
			// 검색할 학생의 번호 입력
			// 검색할 학생의 번호,이름,국어,수학,영어
		// 4. 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		int [] numbers = null; // 학생 번호 저장할 배열
		String [] names = null; // 학생 이름 저장할 배열
		int [] kors = null; // 학생들의 국어점수 저장할 배열
		int [] engs = null; // 학생들의 영어점수 저장할 배열
		int [] maths = null; // 학생들의 수학점수 저장할 배열
		
		
		
		
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		
		System.out.println("번호 입력하세요");
		int num = sc.nextInt();
		
		System.out.println("이름 입력하세요");
		int name = sc.nextInt();
		
		System.out.println("국어점수 입력하세요");
		int kor = sc.nextInt();
		
		System.out.println("수학점수 입력하세요");
		int math = sc.nextInt();
		
		System.out.println("영어점수 입력하세요");
		int eng = sc.nextInt();
		
		
	
		
	}

}
