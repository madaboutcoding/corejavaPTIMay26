package com.pti.demo;

public class App {

	public static void main(String[] args) {
		int totalScore=800;
		int actualScore=550;
		double percentage=(actualScore*100)/totalScore;
		System.out.println("ActaulScore: "+actualScore);
		System.out.println("TotalScore: "+totalScore);
		System.out.println("Overall %is: "+percentage);
	}
}
//class->name should be PascalCase
//variable->name should be camelCase
//method->name should be camelCase
//constant variable=>all Caps 
//final double PI=3.14