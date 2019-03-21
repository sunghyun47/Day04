package com.google.array1;

import java.util.Scanner;

public class ArrayTest_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] ar = {10,32,15,27,46,52};
		
		//인덱스 입력받아서 해당 인덱스 번호 값 출력
		//다른번호 입력하면 없는번호입니다 출력
		
		System.out.println("검색할 번호 입력");
		
		int index = sc.nextInt();
		
		if(index >ar.length || index<0) { //숫자가 아닌 ar.length(배열크기)로 변경
			System.out.println("없는번호");
		}
		else {
			System.out.println("ar[index]");
		}
		
		
	}

}
