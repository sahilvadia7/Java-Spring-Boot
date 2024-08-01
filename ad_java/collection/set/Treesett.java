package ad_java.collection.set;

import java.util.Collection;
import java.util.TreeSet;

public class Treesett {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new TreeSet<Integer>();

        // treeset extends sorting set
        // it give you sorted values
        
        nums.add(4);
        nums.add(46);
        nums.add(16);
        nums.add(7);
        nums.add(64);

        System.out.println(nums);

    }
}
