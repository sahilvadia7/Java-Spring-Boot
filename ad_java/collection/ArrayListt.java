package ad_java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

        Collection a =new ArrayList<>();
        a.add(1);
        System.out.println(a);

        //also if you work with index you need to use List because Collection not working with indexes.
        List<Integer> numList = new ArrayList<Integer>();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        
        System.out.println(numList.indexOf(3));

    }
}
