package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Accept two numbers from user 
		// give output of 
		// Addition
		// Subtraction
		// Multiplication
		// Division 
		// create methods for each operation
		
		try {
			int num1=0;
			int num2=0;
			double result=0.0;
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter num1:");
			num1=scanner.nextInt();
			
			System.out.println("Enter num2:");
			num2=scanner.nextInt();
			
//			result=num1+num2;
			result=add(num1,num2);
			System.out.println(num1+" + "+num2+" = "+result);
			
//			result=num1-num2;
			result=sub(num1,num2);
			System.out.println(num1+" - "+num2+" = "+result);
			
//			result=num1*num2;
			result=mul(num1,num2);
			System.out.println(num1+" * "+num2+" = "+result);
			
//			result=num1/num2;
			result=div(num1,num2);
			System.out.println(num1+" / "+num2+" = "+result);
			
			scanner.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static double div(int num1, int num2) {
		
		return num1/num2;
	}

	private static double mul(int num1, int num2) {

		return num1*num2;
	}

	private static double sub(int num1, int num2) {

		return num1-num2;
	}

	private static double add(int num1, int num2) {
		
		return num1+num2;
	}

}
