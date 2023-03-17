package com.tnsif.programs;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		CarClass ob =new CarClass();
		ob.forward();
		ob.backward();
		ob.stop();
		System.out.println(ob.reg);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the reg");
		int reg=sc.nextInt();
		System.out.println("reg no is "+reg);
	}

}
