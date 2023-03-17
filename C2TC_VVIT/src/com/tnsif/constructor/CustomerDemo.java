package com.tnsif.constructor;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String city;
		int id;
		System.out.println("enter customer name");
		name = sc.nextLine();
		System.out.println("enter customer id");
		id = sc.nextInt();

		System.out.println("enter customer city");
		System.out.println();
		city = sc.nextLine();
		Customer ob = new Customer();
		ob.setCustomerId(id);
		ob.setCustomerName(name);
		ob.setCustomerCity(city);
		System.out.println(name + " " + id);

	}

}
