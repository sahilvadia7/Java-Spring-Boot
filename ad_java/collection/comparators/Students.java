package ad_java.collection.comparators;

public class Students implements Comparable<Students>{
   private int age,year;
   private String name;
   

public Students(int age, int year, String name) {
    this.age = age;
    this.year = year;
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public int getYear() {
    return year;
}
public void setYear(int year) {
    this.year = year;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
@Override
public String toString() {
    return "Strudents [age=" + age + ", year=" + year + ", name=" + name + "]";
}
@Override
public int compareTo(Students arg0) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
}


   
}
