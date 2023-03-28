package com.tnsif.interfacekeyword;

public class Rectangle implements Shape{
	private float length;
	private float breadth;
	
	
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float claculateArea() {
		float area=length*breadth;
		return area;
	}

	@Override
	public float calculatePerimeter() {
		float perimeter=2*(length+breadth);
		return perimeter;
	}

}
