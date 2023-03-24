package com.tnsif.staticmethod;

public class MyclassDemo {

	public static void main(String[] args) {
		Myclass ob = new Myclass();
		System.out.println(ob);
		Myclass.display();// can call static method by class name
	}

}
