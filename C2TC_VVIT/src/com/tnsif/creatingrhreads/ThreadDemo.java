package com.tnsif.creatingrhreads;

public class ThreadDemo {

	public static void main(String[] args) {
		CreatingThreadOne t=new CreatingThreadOne();
		t.start();//starting thread
		//create object of my class and pass it to thread class as we cannot 
		//create object of interface
		CreatingThreadTwo mc=new CreatingThreadTwo();
		Thread tt =new Thread(mc);
		tt.run();
		}

}
