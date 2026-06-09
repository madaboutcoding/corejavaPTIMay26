package com.pti.demo;

import com.pti.demo.model.Product;//ctrl+shift+o import



public class App {

	public static void main(String[] args) {
		
		Product p1=new Product("Maggie",20.0);
		Product p2=new Product("Pepsi",20.0);
		Product p3=new Product("Mazza",20.0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p3=new Product("Miranda",20.0);
		System.out.println(p3);
		
		p3.setUnitPrice(45.0);
		System.out.println(p3);
	}
	

}
