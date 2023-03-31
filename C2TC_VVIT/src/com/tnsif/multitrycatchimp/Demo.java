package com.tnsif.multitrycatchimp;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("value of x and y"+x+" "+y+" ");
		MultiTryCatch ob=new MultiTryCatch();
		ob.nestedtry(x,y);
	}

}
