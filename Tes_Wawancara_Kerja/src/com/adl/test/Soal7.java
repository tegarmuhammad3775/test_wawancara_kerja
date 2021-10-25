package com.adl.test;

import java.util.Scanner;

public class Soal7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Soal7---");
		System.out.print("Input1 : ");
		int input1 = sc.nextInt();
		System.out.print("Input2 : ");
		int input2 = sc.nextInt();
		
		System.out.println();
		
		int digit = (input1+"").length();
		
		int length0 = input2 - digit;
		String temp = "";
		
		for (int i = 0; i < length0; i++) {
			temp+="0";
		}
		
		String res = temp+input1;
		
		System.out.print("Output : " + res);
		
	}

}
