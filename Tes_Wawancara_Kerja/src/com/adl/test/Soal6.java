package com.adl.test;

import java.util.Scanner;

public class Soal6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Soal 6---");
		System.out.print("Input : ");
		int input = sc.nextInt();
		int counter = input;
		
		for (int i = 1 ; i <= input; i++) {
			for (int j = 1 ; j <= j * i ; j++) {
	          if(j%1 == 0 && counter > 0){
	        	  
	        	  for (int k = 0; k < j; k++) {
	        		  System.out.print("*");
				  }
	        	  
	        	  counter--;
	        	  System.out.println();
	          }		  
			}
			
		}
		
	}

}
