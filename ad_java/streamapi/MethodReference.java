package ad_java.streamapi;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Sahil","Nikhil","Ankit","Aryan");
        List<String> newstr =names.stream()
                                        .map(String :: toUpperCase)
                                        .toList();

        newstr.forEach(System.out :: println);
    }
    
}