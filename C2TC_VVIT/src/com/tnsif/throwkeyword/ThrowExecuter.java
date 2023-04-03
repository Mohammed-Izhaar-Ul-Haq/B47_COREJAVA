package com.tnsif.throwkeyword;

public class ThrowExecuter {

	public static void main(String[] args) {
		try {
			
			ThrowDemo.avg();
		}
		catch(ArithmeticException e) {
			 System.out.println("caugth"+e);
	}
	}
}
