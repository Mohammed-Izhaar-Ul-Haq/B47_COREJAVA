package com.thsif.comparator;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new NullPointerException("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println("World");
		}
	}

}
