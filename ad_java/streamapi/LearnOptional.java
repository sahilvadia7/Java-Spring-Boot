package ad_java.streamapi;

import java.util.List;
import java.util.*;

public class LearnOptional {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Sahil","Ankit","Nikhil","Aryan");
        Optional<String> sortname = names.stream()
                                            .filter(str -> str.contains("i"))
                                            .findFirst();
        
        System.out.println(sortname.orElse("Not Found"));
    }
}
