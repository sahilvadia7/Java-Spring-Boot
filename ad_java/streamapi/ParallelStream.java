package ad_java.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    
    public static void main(String[] args) {
        int size =10000;
        List<Integer> list =new ArrayList<>(size);
        Random ran = new Random();

        for (int i=0; i<size; i++){
            list.add(ran.nextInt(100));
        }

        long startN = System.currentTimeMillis();
        int nlist = list.stream()
                            .map(n -> n*2)
                            .mapToInt(i -> i)
                            .sum();

        long endN = System.currentTimeMillis();

        System.out.println("N time: "+(endN-startN));
        System.out.println("Total of normal stream: "+nlist);


        //it use multi threading in background it use in large data sets
        
        long startP = System.currentTimeMillis();
        int plist = list.parallelStream()
                            .map(n -> n*2)
                            .mapToInt(i -> i)
                            .sum();

        long endP = System.currentTimeMillis();

        System.out.println("N time: "+(endP-startP));
        System.out.println("Total of Parallel-Stream: "+plist);
    }
}
