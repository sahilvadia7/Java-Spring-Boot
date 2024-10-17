//Create a program to manage a list of unique city names using a `HashSet`. Allow adding cities, checking if a city exists, and displaying all cities.
package set.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Cities{

    private String cityName;

    public Cities(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities = (Cities) o;
        return Objects.equals(cityName, cities.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cityName);
    }
}

public class problem1 {

    static Set<Cities> cities = new HashSet<>();
    static Scanner in = new Scanner(System.in);

    private void menu(){
        int opt;
        do {
            System.out.println("1. Add Cities");
            System.out.println("2. View Cities");
            System.out.println("0. exit");
            System.out.print("Select opt: ");
            opt = in.nextInt();

            switch (opt){
                case 1:
                    System.out.print("Enter city: ");
                    String cityName = in.next();
                    cities.add(new Cities(cityName));
                    break;

                case 2:
                    System.out.println("List of City");
                    int i=1;
                    for(Cities city: cities){
                        System.out.println(i +" " +city.getCityName());
                        i++;
                    }
                    break;
                default:
                    System.out.println("Select proper option");
                    break;
            }

        }while (opt!=0);
    }


     public static void main(String[] args) {
        problem1 pro = new problem1();
        pro.menu();
    }
}
