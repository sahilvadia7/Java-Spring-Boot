package ad_java.collection.set;


import java.util.Collection;
import java.util.HashSet;



public class HashSett {
    public static void main(String[] args) {
        
        Collection<Integer> numList = new HashSet<Integer>();
        // also use tree set it give you shorted value

        numList.add(19);
        numList.add(21);
        numList.add(85);
        numList.add(37);
        numList.add(48);
        numList.add(57);

        //not allowed to insert duplicate values
        //no index
        //set not give you value in shorted formate
        //collection of uniq 
        numList.add(37);

        System.out.println(numList);
    }
}
