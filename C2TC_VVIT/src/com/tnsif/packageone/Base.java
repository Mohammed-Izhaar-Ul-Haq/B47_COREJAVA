package com.tnsif.packageone;

public class Base {
	//access specifier
	int varDefault=10;//default 
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//default method
	void methodDefault() {
		System.out.println("default access base class");
		System.out.println("default variable is"+varDefault);
	}
	
	public void methodPublic() {
		System.out.println("public access base class");
		System.out.println("public variable is"+varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("private access base class");
		System.out.println("private variable is"+varPrivate);
	}
	
	protected void methodProtected() {
		System.out.println("protected access base class");
		System.out.println("protected variable is"+varProtected);
	}
	
}
