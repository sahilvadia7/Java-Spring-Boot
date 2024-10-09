//Problem Statement: Write a program to store employee details (ID, name) in an `ArrayList` and sort the list based on employee names.
package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class employee{
    private int id;
    private String name;

    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class problem2 {

    public static void main(String[] args) {
        List<employee> employees = new ArrayList<>();
        employees.add(new employee(1,"Neal"));
        employees.add(new employee(2,"suresh"));
        employees.add(new employee(3,"rajesh"));

        employees.sort(new Comparator<employee>() {
            @Override
            public int compare(employee o1, employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        employees.forEach(System.out::println);
    }
}

