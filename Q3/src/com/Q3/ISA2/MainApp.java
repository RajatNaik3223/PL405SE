package com.Q3.ISA2;

public class MainApp {
	public static void main(String[] args) {
	
		Operations op=new Operations(10.5,30.5);
		
		System.out.println("The sum is  :"+op.sum());
		System.out.println("The Product is :"+op.product());
		System.out.println("The sum is :"+op.diff());
	
	}

}
