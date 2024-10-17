//Write a program to remove duplicate elements from an `ArrayList` of integers and store unique elements in a `HashSet`.
package set.hashset;

import java.util.*;

class  Student{
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}

public class problem2 {

    static List<Student> studentList = new LinkedList<>();
    static Set<Student> studentMap = new HashSet<>();

    public static void main(String[] args) {

        studentList.add(new Student(1,"sahil",55));
        studentList.add(new Student(2,"nikhil",66));
        studentList.add(new Student(1,"sahil",55));

        System.out.println("Data With Duplicate Value");
        System.out.println(studentList);

        for (Student map : studentList){
            studentMap.add(map);
        }

        System.out.println("No Duplicate Value");
        System.out.println(studentMap);

    }
}
