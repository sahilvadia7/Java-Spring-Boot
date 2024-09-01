package ad_java.collection.List;
import java.util.*;


public class Queuee {

    public static void main(String[] args) {
        
        // LinkedList have queue and list both interface
        //linkedlist using Queue interface that implements Queue method           

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("Queue: "+queue);
        System.out.println("Peek element: "+queue.peek());
        System.out.println("Poll element: "+queue.poll());
        System.out.println(queue);


        //linkedlist using List interface that implements List method           
        List<Integer> queue1 = new LinkedList<>();

        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);

        System.out.println("Queue1: "+queue1);
        System.out.println("remove fisrt element: "+queue1.removeFirst());
        System.out.println(queue1);


    }
}
