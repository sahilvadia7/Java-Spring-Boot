package ad_java.streamapi;
import java.util.*;

public class ConstructorReference {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("sahil","aryan","ankit","nikhil");

        List<Student> students = new ArrayList<>();
        List<Student> students1 = new ArrayList<>();


        //normal way
        // for(String name : names){
        //     students.add(new Student(name));
        // }

        //Using stream
        students = names.stream()
                        .map(name -> new Student(name))
                        .toList();
        students.forEach(System.out :: println);

        //Using stream with Method Reference & Constructor Reference
        System.out.println("\n\nUsing Method Reference & Constructor Reference");
        students1 = names.stream()
                        .map(Student::new)
                        .toList();

        students1.forEach(System.out::println);
    }
}
