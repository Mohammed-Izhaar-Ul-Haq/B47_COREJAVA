package com.tnsif.lamdaexp;

public class LamdaWithParam {

	public static void main(String[] args) {
		int x=5;
		Cube c=(int a)->{return(a*a*a);};
		System.out.println(c.calculate(x));
	}

}
