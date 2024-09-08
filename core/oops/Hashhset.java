package oops;
import java.util.*;

public class Hashhset {

	public static void main(String[] args) {
		//  Auto-generated method stub
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(3);
		
		
		nums.remove(1);
		for(int i=0; i<11; i++) {
			if(nums.contains(i)) {
				System.out.println("present " + i);
			}
		}
		
		System.out.println(nums.size());
		
		

	}

}
