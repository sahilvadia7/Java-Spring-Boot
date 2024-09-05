package ad_java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    
    public static void main(String[] args) {
        
        Map<Integer,String> MyMap = new HashMap<>();
        MyMap.put(1,"Orange");
        MyMap.put(2,"Apple");
        MyMap.put(3,"Banana");
        MyMap.put(5,"Strawberry");

        MyMap.putIfAbsent(4, "Mango");
        System.out.println(MyMap);


    }
}
