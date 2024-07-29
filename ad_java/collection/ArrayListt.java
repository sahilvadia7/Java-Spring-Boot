package ad_java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListt {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<Integer>();

        // Collection give you objects it will not give any type of data
        // So use generic feature was introduce java after long time after the collection
        // Generics<> This allows for code reusability, type safety, and elimination of the need for type casting.
        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(13);
        nums.add(13);
        System.out.println(nums);


        for(int i: nums){   
            System.out.println(i);
        }
    }
}
