package oops;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mercedes");
		Collections.sort(cars);
		
		System.out.println(cars.size());
		System.out.println(">>."+cars.get(0));
		cars.set(2,"lamborghini");
		
		cars.remove(1);
		
		for(String x: cars) {
			System.out.println(x);
		}
	}

}
