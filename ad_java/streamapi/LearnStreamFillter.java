package ad_java.streamapi;
import java.util.*;
import java.util.stream.Stream;
import java.util.function.*;

public class LearnStreamFillter {
    
    public static void main(String[] args) {
        
        List<String> Cars = new ArrayList<>();
        Cars.add("BMW-M1");
        Cars.add("BMW-M2");
        Cars.add("BMW-M3");
        Cars.add("BMW-M5");
        Cars.add("BMW-M7");
        Cars.add("BMW-M8");
        Cars.add("Audi-A8");
        Cars.add("Audi-A4");
        Cars.add("Audi-R8");


        Predicate<String> p = new Predicate<String>() {

            @Override
            public boolean test(String t) {
                if(t.startsWith("Audi")){
                    return true;
                }
                else{
                    return false;
                }
            }
            
        };

        Stream<String> cars = Cars.stream()
                        .filter(p);
        
        System.out.println("\nimplementing Predicate write logic Into test Method");
        cars.forEach(a -> System.out.println(a));


        //20 Line of code into 3 line {Another Way}
        System.out.println("\n\nWithOut implementing Predicate write logic diract Into Fillter");
        Stream<String> car1 = Cars.stream().filter(a -> a.startsWith("BMW"));
        car1.forEach(n -> System.out.println(n));

    }
}
