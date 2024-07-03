package oops;

import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> cars = new LinkedList<String>();
		cars.addFirst("BMW");
		cars.add(1,"Audi");
		cars.addLast("Mercedes");
		cars.addLast("Lamborghini");

		
		for(String s: cars) {
			System.out.println(s);
		}
	}

}
