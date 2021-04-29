package com.Q3.ISA2;

public class Operations {
	double num1;
	double num2;
	
	public Operations(double a,double b) {
		this.num1=a;
		this.num2=b;
	}
	
	public double sum() {
		
		return (num1+num2);
	}
	
	public double product() {
		
		return (num1*num2);
	}
	
	public double diff() {
		
		return (num1 - num2);
	}
	
}

