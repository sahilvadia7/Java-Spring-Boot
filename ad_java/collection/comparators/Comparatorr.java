package ad_java.collection.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatorr {
    public static void main(String[] args) {
        

        // create own sorting logic & pass with sort method
        Comparator<Integer> com = new Comparator<Integer>(){

                //comparing value by Oth index only
                public int compare(Integer i, Integer j){
                    if (i%10 > j%10) {
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(7);
        nums.add(43);
        nums.add(24);
        nums.add(67);

        Collections.sort(nums,com);
        System.out.println(nums);

    }
}
