package ad_java.streamapi;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;


public class LearnStreamApi {
    

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(81);
        list.add(12);
        list.add(21);
        list.add(14);
        list.add(1);

        System.out.println("List using forEach Method with lambda function");
        list.forEach(n -> System.out.println(n));
        
        //Don't change main list while performing any operation
        System.out.println("\nStream ArrayList\n");
        Stream<Integer> data = list.stream();
        // data.forEach(d -> System.out.println(d));

        //Fillter
        Stream<Integer> StreamFillter = data.filter(e -> e%2==0);
        System.out.println("Stream Fillter");
        // StreamFillter.forEach(e ->  System.out.println(e));

        //Map
        System.out.println("Stream Map");
        Stream<Integer> StreamMap = StreamFillter.map(a -> a*2);
        StreamMap.forEach(a -> System.out.println(a));


        System.out.println("\nStream function in one");
        List<Integer> nums = Arrays.asList(3,4,5,8,65,4);
        Stream<Integer> result = nums.stream()
                .filter(n -> n%2 ==0)
                .map(n -> n+2);

        System.out.println("Original List");
        nums.forEach(c -> System.out.print(c+" "));
        System.out.println("\nAfter Stream Use");
        result.forEach(c -> System.out.print(c+" "));
    }
}
