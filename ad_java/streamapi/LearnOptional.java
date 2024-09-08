package ad_java.streamapi;

import java.util.List;
import java.util.*;

public class LearnOptional {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Sahil","Ankit","Nikhil","Aryan");

        // Using Optional class
        Optional<String> sortname = names.stream()
                                            .filter(str -> str.contains("i"))
                                            .findFirst();
        System.out.println("\nOptional class");
        System.out.println(sortname.orElse("Not Found"));

        //Using Stream orElse
        String sortname1 = names.stream()
                                    .filter(str -> str.contains("z"))
                                    .findFirst()
                                    .orElse("not found");

        System.out.println("\nStream orElse");
        System.out.println(sortname1);
    }
}
