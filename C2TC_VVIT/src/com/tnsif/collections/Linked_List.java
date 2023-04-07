package com.tnsif.collections;
import java.util.*;
public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> object=new LinkedList<>();
		object.add("123");
		System.out.println(object);
		object.addFirst("12");
		System.out.println(object);
		object.addLast("1222");
		System.out.println(object);
		object.add(2,"hello");
		System.out.println(object);
		System.out.println(object.size());
		
		Iterator it=object.iterator();
		while(it.hasNext()) {
			Object element =it.next();
			System.out.print(element+" ");
		}
		System.out.println();
		
		

	}

}
