package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamoper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating source of input
		List<String> gseven=Arrays.asList("USA","INDIA","JAPAN");
		//create a stream
		Stream<String> s=gseven.stream();
		Stream<String> hi=s.map(x->x.toLowerCase());
		//terminal operation
		String terminal=hi.collect(Collectors.joining(","));
		System.out.println(terminal);
	}

}
