package com.tnsif.lamdaexp;

import java.beans.Statement;

public class LamdaWithoutParam {
public static void main(String[] args) {
	Statement s=()->{return "hello world";};
	System.out.println(s.greet());
}
}
