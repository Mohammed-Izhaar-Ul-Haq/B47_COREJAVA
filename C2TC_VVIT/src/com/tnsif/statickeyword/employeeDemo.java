package com.tnsif.statickeyword;

public class employeeDemo {

	public static void main(String[] args) {
//		Employee ob1= new Employee();
//		Employee ob2= new Employee();
		Employee ob1 = new Employee();
		System.out.println(Employee.companyName);
		Employee ob = new Employee("izhaar", 123);
		System.out.println(ob);
		ob = new Employee("touheed", 124);
		System.out.println(ob);
		System.out.println(Employee.count);

	}

}
