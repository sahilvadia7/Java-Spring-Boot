package ad_java.collection.queue;
import java.util.*;


public class PriorityQueuee {

    public static void main(String[] args){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(21);
        pq.offer(20);
        pq.offer(35);
        pq.offer(14);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

    }
}
