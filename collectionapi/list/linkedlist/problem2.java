package list.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    int score;

    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "Name: " + name + ", Score: " + score;
    }
}

public class problem2 {
    // LinkedList to store student records
    private LinkedList<Student> studentList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add a new student record
    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student score: ");
        int score = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        studentList.add(new Student(name, score));
        System.out.println("Student added successfully!");
    }

    // Update an existing student record
    public void updateStudent() {
        System.out.print("Enter student name to update: ");
        String name = scanner.nextLine();
        boolean found = false;

        // Search for the student by name
        for (Student student : studentList) {
            if (student.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new score for " + name + ": ");
                int newScore = scanner.nextInt();
                scanner.nextLine();  // Consume the newline
                student.score = newScore;  // Update the score
                System.out.println("Student score updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // Display all student records
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("Student Records:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    // Main menu for the program
    public void menu() {
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student Record");
            System.out.println("2. Update Student Record");
            System.out.println("3. Display Student Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        problem2 manager = new problem2();
        manager.menu();  // Start the program
    }
}
