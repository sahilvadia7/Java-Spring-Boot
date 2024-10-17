//Create a program that checks if all characters in a given string are unique using a `HashSet`.
package set.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem3 {

    public static boolean uniqueString(String str){
        Set<Character> stringCheck = new HashSet<>();

        for (char c : str.toCharArray()){
            if(!stringCheck.add(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter String: ");
        System.out.println(uniqueString(in.nextLine()));


    }
}
