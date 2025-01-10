// Problem Statement: Create a program to manage a list of book titles using an ArrayList. Allow the user to add, remove, and search for a book in the list.

package list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> BookLibrary = new ArrayList<>();
        String RemoveName;
        int opt;

        do {
            System.out.println("1. add");
            System.out.println("2. view");
            System.out.println("3. remove");
            System.out.println("4. search");
            System.out.println("0. exit");
            System.out.print("Select option : ");
            opt = input.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Number of book you want to enter: ");
                    int num = input.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.print("Enter BookName: ");
                        BookLibrary.add(input.next());
                    }
                    break;
                case 2:
                    if (BookLibrary.isEmpty()) {
                        System.out.println("empty");
                    } else {
                        System.out.println("Books");
                        BookLibrary.forEach(System.out::println);
                    }
                    break;
                case 3:
                    if (BookLibrary.isEmpty()) {
                        System.out.println("empty");
                    } else {
                        System.out.println("Enter book name to remove");
                        RemoveName = input.next();
                        BookLibrary.remove(RemoveName);
                        System.out.println("removed");
                    }
                    break;
                case 4:
                    if (BookLibrary.isEmpty()) {
                        System.out.println("empty");
                    } else {
                        System.out.print("search element: ");
                        String name = input.next();

                        System.out.println(
                            "index of Book: " + BookLibrary.indexOf(name)
                        );
                    }
            }
        } while (opt != 0);
        input.close();
    }
}
