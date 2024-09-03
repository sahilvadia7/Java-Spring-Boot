package ad_java.collection.set;

import java.util.HashSet;
import java.util.Set;

public class studentSet {
    public static void main(String[] args) {
        
        Set<student> students = new HashSet<>();

        // here every time creating new object so hashset allow to add duplicate value 
        // 
        students.add(new student(1,"sahil"));
        students.add(new student(1,"sahil"));
        students.add(new student(2,"ankit"));

        System.out.println(students);
    }
}
