//prints "hello world" as "Hello World" with the first letter of each word capitalized
package list.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem4 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = in.nextLine();

        String[] words = str.split(" ");
        Set<String> caps = new HashSet<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                caps.add(Character.toTitleCase(word.charAt(0)) + word.substring(1));
                System.out.println(Character.toTitleCase(word.charAt(0)) + word.substring(1));
            } else {
                caps.add(word);
            }
        }

        System.out.println(caps);
    }
}
