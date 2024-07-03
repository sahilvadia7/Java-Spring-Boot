package oops;

import java.util.ArrayList;

public class Lambdaa {

	public static void main(String[] args) {

		Runnable obj1 = () ->{
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};

		Thread t1 = new Thread(obj1);
		t1.start();
}
}