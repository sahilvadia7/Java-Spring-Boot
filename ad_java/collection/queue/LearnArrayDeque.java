package ad_java.collection.queue;
import java.sql.Array;
import java.util.*;


public class LearnArrayDeque {
    
    public static void main(String[] args) {

        // ArrayDeque allow to put data from both side also search from both side

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(1);
        arrayDeque.addFirst(10);
        arrayDeque.addLast(5);
        arrayDeque.offer(25);
        arrayDeque.offerFirst(95);
        arrayDeque.offerLast(15);


        System.out.println("Original ArrayDeque: "+arrayDeque);

        System.out.println("pole first: "+arrayDeque.pollFirst());
        System.out.println("Pole Lase: "+arrayDeque.pollLast());    
        System.out.println("After POle: "+arrayDeque);
    }
}
