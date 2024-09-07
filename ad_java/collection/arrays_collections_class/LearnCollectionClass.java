package ad_java.collection.arrays_collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ad_java.collection.set.student;

public class LearnCollectionClass {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(72);
        list.add(23);
        list.add(94);
        list.add(46);
        list.add(13);

        System.out.println("min :"+Collections.min(list));
        System.out.println("max :"+Collections.max(list));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.reversed());


        List<student> students = new ArrayList<>();
        students.add(new student(4, "sahil"));
        students.add(new student(2, "nikhil"));
        students.add(new student(3, "ankit"));
        students.add(new student(1, "aryan"));


        System.out.println(students);

        Collections.sort(students,new Comparator<student>() {

            //sort by rollno
            @Override
            public int compare(student o1, student o2) {
               return o1.getRollno() - (o2.getRollno());
            }
            
        });

        System.out.println(students);

    }
}
