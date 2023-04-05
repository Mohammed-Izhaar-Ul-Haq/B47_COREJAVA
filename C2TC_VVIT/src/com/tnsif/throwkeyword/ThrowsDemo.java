package com.tnsif.throwkeyword;

import java.io.IOException;

//program to demonstrate throws for method
//cannot throw multiple exception at once
//only the first exception is thrown if
public class ThrowsDemo {
	static void check() throws ArithmeticException{
		System.out.println("inside check function");
	throw new ArithmeticException();
	}
}
