package ad_java.collection.List;
import java.util.*;


public class Stackk {

    public static void main(String[] args) {
        Stack<String>  Mentos = new Stack<>();

        Mentos.push("Orange");
        Mentos.push("Apple");
        Mentos.push("Strawberry");
        Mentos.push("PineApple");

        System.out.println("Stack: "+Mentos);
        System.out.println("Top Of Stack: "+Mentos.peek());
        System.out.println("Pop form Stack: "+Mentos.pop());

        Iterator<String> iterator = Mentos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    
}
