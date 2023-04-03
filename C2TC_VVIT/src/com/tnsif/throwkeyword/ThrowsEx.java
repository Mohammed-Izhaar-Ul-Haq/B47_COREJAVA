package com.tnsif.throwkeyword;

public class ThrowsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ThrowsDemo.check();
}
catch(ArithmeticException e) {
	System.out.println("caugth the ex");
}
	}

}
