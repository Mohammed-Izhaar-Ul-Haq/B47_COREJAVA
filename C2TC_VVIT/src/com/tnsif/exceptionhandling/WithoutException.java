package com.tnsif.exceptionhandling;

public class WithoutException {

	public static void main(String[] args) {
		//without exception handling
		/*
		 * int d=0; int a=50/d;//exception occured at this line
		 * System.out.println("Sorry cant work");
		 */
		//with exception handling
		int d=0;
		int a;
		try {
			a=22/0;
			System.out.println("This will not be printed");
		} catch(ArithmeticException e){
			System.out.println("division by 0");
		}
		System.out.println("this will be printed");
		
	}

}
