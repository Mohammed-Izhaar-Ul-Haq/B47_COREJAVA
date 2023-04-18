package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		//creating source of data
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(23);
		list.add(13);
		System.out.println(list);
		//creating the stream by using stream method
		Stream<Integer> s=list.stream();
		
		Set<Integer> set=s.collect(Collectors.toSet());
	System.out.println("values are"+set);
	}

}
