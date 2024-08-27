package ad_java.collection.List;
import java.util.Spliterator; 
import java.util.stream.Stream; 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        

     

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(2);
        list.add(20);
        list.add(200);
        

        System.out.println("Way to print ArrayList");
        System.out.println("\noriginal arraylist");
        System.out.println(list);

        System.out.println("\nUsing loop");
        for(Integer i : list){
            System.out.print(i+" ");
        }

        System.out.println("\n\nSort ArrayList");
        list.sort(null);
        System.out.println(list);

        System.out.println("\nIterator ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

     
        System.out.println("\n\nbuilt-in Method");
        ArrayList<Integer> cloned = new ArrayList<>(list);
        list.clear();
        System.out.println("\nafter clean()"+list);
        System.out.println("\nCloned List");
        System.out.println(cloned);
        System.out.println("Contains {200}:"+cloned.contains(200));
        System.out.println("get(1): "+cloned.get(1));
        System.out.println("indexOf(10): "+cloned.indexOf(10));
        System.out.println("isempty(list): "+list.isEmpty());

        //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        System.out.println("SubList(): "+cloned.subList(0, 4));

         // getting Spliterator object on al 
         Spliterator<Integer> splitr1 = cloned.spliterator(); 
          
         // estimateSize method 
         System.out.println("estimate size : " + splitr1.estimateSize()); 
                   
    
     }

   
}
