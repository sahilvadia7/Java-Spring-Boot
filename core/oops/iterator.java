package oops;
import java.util.*;
public class iterator {

	public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(12);
		    numbers.add(8);
		    numbers.add(2);
		    numbers.add(23);
		    Iterator<Integer> it = numbers.iterator();
		    
		    
		    while(it.hasNext()) {
		    	  System.out.println(it.next());
		    	}
//		    while(it.hasNext()) {
//		      Integer i = it.next();
//		      if(i < 10) {
//		        it.remove();
//		      }
//		    }
//		    System.out.println(numbers);
//		  }
	}
}
