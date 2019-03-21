package com.google.array1;

import java.util.Scanner;

public class ArrayTest_4 {

	public static void main(String[] args) {

		int [] ar = {1,3,5};
		// System.out.println(ar[0]);
		// System.out.println(ar[1]);
		// System.out.println(ar[2]);
		
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		int [] ar2 = new int[3];
		// ar2[0] = sc.nextInt();
		// ar2[1] = sc.nextInt();
		// ar2[2] = sc.nextInt();
		
		for(int i=0; i<ar2.length; i++) {
			ar2[i]=sc.nextInt();
		}
	
	}

}
