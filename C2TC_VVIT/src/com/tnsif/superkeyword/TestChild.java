package com.tnsif.superkeyword;

class TestParest{
	public void test() {
		System.out.println("This is a parent class");
	}
}

public class TestChild extends TestParest{
	public void test() {
		System.out.println("this is child class");
	}
 void display() {
	 test();
	 super.test();
 }
}
