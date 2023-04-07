package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		
	//creating arraylist
		ArrayList<String> vvit=new ArrayList<>();
			vvit.add("hi");//add
			vvit.add(null);
			vvit.add("hello");
		System.out.println(vvit);//display
		vvit.remove(1);
		System.out.println(vvit);
		//traversing
		for(String ele:vvit) {
			System.out.println(ele);
		}
		System.out.println(vvit.size());//size of array list
		Collections.sort(vvit);//sorting
		System.out.println(vvit);
		Collections.reverse(vvit);//reverse 
		System.out.println(vvit);
		vvit.clear();//clear
		System.out.println(vvit);
	
	}

}
