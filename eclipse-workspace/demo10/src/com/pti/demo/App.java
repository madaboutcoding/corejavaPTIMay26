package com.pti.demo;

public class App {

	public static void main(String[] args) {
		int num1=101;
		int num2=2;
		int result=0;
		result=add(num1,num2);
		System.out.println("Addition is: "+result);
		result=sub(num1,num2);
		System.out.println("Subtraction: "+result);
		result=mul(num1,num2);
		System.out.println("Multiplication: "+result);
		double divResult=div(num1,num2);
		System.out.println("Division:"+divResult);	
	
	}
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	//sub
	public static int sub(int num1,int num2) {
		return num1-num2;
	}
	//mul
	public static int mul(int num1,int num2) {
		return num1*num2;
	}
	//div
	public static double div(int num1,int num2) {
		return num1/num2;
	}
	
}
//Class->
//data members->instance variable 
//methods-> not static and static 
//constructor=App()