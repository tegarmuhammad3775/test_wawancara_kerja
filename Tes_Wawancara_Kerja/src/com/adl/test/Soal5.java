package com.adl.test;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("---Soal 7---");
		System.out.print("Input : ");
		int max = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 1 ; i <= max; i++) {
				
				int temp = num1 + num2;
				num1 = num2;
				num2 = temp;
				
				if(num1 <= max ) {
					System.out.print(num1+" ");
				}
				
		}
	    

	}

}
