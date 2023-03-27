package com.tnsif.abstractkeyword;

public abstract class Shape {// incomplete class
	protected float area;

	abstract void calArea();//does not have body

	void show() {
		System.out.println("area of shape" + area);
	}

}
