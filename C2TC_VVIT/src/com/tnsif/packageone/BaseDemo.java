package com.tnsif.packageone;

public class BaseDemo {

	public static void main(String[] args) {
		Base b= new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		b.varDefault=11;
		b.methodDefault();
		//cannot change
		b.methodProtected();
		b.varPublic=21;
		b.methodPublic();
		
	}

}
