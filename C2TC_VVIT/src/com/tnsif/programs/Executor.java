package com.tnsif.programs;

public class Executor {

	public static void main(String[] args) {
		CarClass ob =new CarClass();
		ob.forward();
		ob.backward();
		ob.stop();
		System.out.println(ob.reg);
	}

}
