package ad_java.collection.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Iterativee
 */
public class Iterativee {

    public static void main(String[] args) {
        

        Collection<Integer> Nums = new HashSet<Integer>();

        Nums.add(10);
        Nums.add(27);
        Nums.add(54);
        Nums.add(19);


        //Iterator is a parent class of Colletion
        Iterator<Integer> iterator = Nums.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
    }
}