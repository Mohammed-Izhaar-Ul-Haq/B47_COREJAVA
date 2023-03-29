package com.tnsid.impnestedcatch;

//program to demo nested catch
public class NestedCatchDemo {
	int arr[] = new int[4];//declaring array

	void nestedCatch() {
		try {
		arr[3]=20/0;//Arithmetic exception
		arr[10]=5;//Array out of bound exception
		System.out.println("try block");
	}
	catch(ArithmeticException a) {
		System.out.println("A number cannot be divided by 0"+a);
		//here a=java.lang.ArithmeticException:
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("element out of bound"+e);
	}
		catch(Exception e) {
			//if no exception match then this is super class exception it will match
			System.out.println("no exception match"+e);
		}
	}

}
