package ad_java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class LearnStreamMap {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(11,25,35,24,54,8,55,232,2);

        // # Using Function Interface

            //Function interface with Apply method
            Function<Integer,Integer> fun = new Function<Integer,Integer>() {

                @Override
                public Integer apply(Integer t) {
                    if(t%2==0)
                        return t+2;
                    else
                        return t;
                }
                
            };

            // Passing fun object into map function of Stream

            Stream<Integer> nums = numbers.stream()
                                            .map(fun);

            nums.forEach(n -> System.out.println(n));

        // # Without Function Interface

        // Map: When you need to transform data.
        // Filter: When you need to select specific elements from data.
            
            Stream<Integer> nums1 = numbers.stream().filter(n -> n%2==0).map(n -> n+2);
            System.out.println("\nWith Normal way");
            nums1.forEach(n -> System.out.println(n));
    }
}
