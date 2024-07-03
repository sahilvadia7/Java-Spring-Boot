
// Imagine you are at a movie theater that offers a discount to students. The conditions for getting the student discount are:

// The person must be a student (they have a valid student ID).
// If the person is under 18, they automatically qualify for the discount, regardless of their student status.
// If the person is 65 or older, they also qualify for the discount.

package core.conditional_statement;

import java.util.Scanner;

public class movie {
 

    public static void main(String[] args) {

      // Create a Scanner object to read input from the console
      Scanner scanner = new Scanner(System.in);

      // Prompt the user to enter age and student ID status
      System.out.print("Enter your age: ");
      int age = scanner.nextInt();
      System.out.print("Do you have a valid student ID? (yes/no): ");
      String hasStudentIDInput = scanner.next();
      boolean hasStudentID = hasStudentIDInput.equalsIgnoreCase("yes");

      System.out.print("Do you have a Movie-Pass? (yes/no): ");
      String hasPassInput = scanner.next();
      boolean hasPass = hasPassInput.equalsIgnoreCase("yes");

      // Determine eligibility for the student discount
      boolean isEligibleForDiscount = false;

      // Apply conditions to determine eligibility
      if (age < 18) {
          isEligibleForDiscount = true;
      } else if (age >= 65) {
          isEligibleForDiscount = true;
      } else if (hasStudentID) {
          isEligibleForDiscount = true;
      }
      else if (hasPass) {
        isEligibleForDiscount =true;
      }

      // Display the result
      if (isEligibleForDiscount) {
          System.out.println("You are eligible for the discount.");
      } else {
          System.out.println("You are not eligible for the discount.");
      }

      // Close the scanner
      scanner.close();
    
    }   
}
