package com.pti.demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try {
			int actualScore=0;
			int totalScore=0;
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Ener actual Score");
			actualScore=scanner.nextInt();
			
			System.out.println("Enter Total Score");
			totalScore=scanner.nextInt();
			
			double percentage=
					calculatePercentage(actualScore, totalScore);
			
			System.out.println(actualScore+"/"+totalScore+"="+percentage+"%");
			
			scanner.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static double calculatePercentage(int actual,int total) {
		return (actual*100)/total;
	}

}
