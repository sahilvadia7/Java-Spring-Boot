package ad_java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LearnStreamReduce {
    
    public static void main(String[] args) {
        
                List<Integer> num = Arrays.asList(11,25,35,24,54,8,55,232,2);

                int total = num.stream()
                                    .filter(n -> n%2==0)
                                    .map(n -> n+1)
                                    .reduce(0, (c,e) -> c+e);

                System.out.println(total);


                System.out.println("\nSorted Value with Fillter & Map");
                Stream<Integer> SortedValue = num.stream()
                                                .filter(n -> n%2==0)
                                                .map(n -> n/2)
                                                .sorted();
                SortedValue.forEach(n -> System.out.println(n));
    }
}
