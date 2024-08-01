package ad_java.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashh {
    public static void main(String[] args) {
        

        // HashMap it support multi threading with external synchronized
        // Map is interface it ask any two values <K,V>
        Map<String,Integer> students = new HashMap<>();
        students.put("Sahil", 85);
        students.put("Ankit", 98);
        students.put("Nikhil", 88);
        students.put("Aryan", 95);

        System.out.println(students);

        //print one by one HashMap values
        for(String key: students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }


        Map<Integer,String> employee = new Hashtable<>();
        employee.put(1, "Ankit");
        employee.put(2, "Aryan");
        employee.put(3, "Nikhil");
        employee.put(4, "Sahil");

        System.out.println("\nHashTable");
        System.out.println(employee);


        
    }
}
