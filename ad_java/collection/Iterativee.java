package ad_java.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Iterativee
 */
public class Iterativee {

    public static void main(String[] args) {
        

        Collection<String> cars = new HashSet<String>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("TaTa");


        //Iterator is a parent class of Colletion
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
    }
}