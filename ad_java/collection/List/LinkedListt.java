package ad_java.collection.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListt {
    public static void main(String[] args) {
        
        List<Integer> linkList = new LinkedList<>();
        linkList.addFirst(1);
        linkList.add(16);

        linkList.addLast(15);

        System.out.println(linkList);
    }
    
}
