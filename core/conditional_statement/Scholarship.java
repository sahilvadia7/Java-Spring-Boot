// Scenario: Scholarship Eligibility Checker
// In this scenario, a university offers a scholarship based on certain criteria:

// The student must have a GPA of 3.5 or higher.
// The student must have participated in at least one extracurricular activity.
// If the student has a GPA of 4.0, they automatically qualify for the scholarship regardless of extracurricular participation.


package core.conditional_statement;

import java.util.Scanner;

public class Scholarship  {

     public static void main(String[] args) {
          
          float GPA;
          boolean extracurricularState=false,eligibleScholar = false;
          String extracurricular;
          Scanner s =new Scanner(System.in);

          System.out.print("Enter GPA :");
          GPA = s.nextFloat();

          System.out.print("Do yo invovle in any extra currricular activity (yes/no): ");
          extracurricular = s.next();
          extracurricularState = extracurricular.equalsIgnoreCase("yes");
          
          if (GPA > 4.0) {
               eligibleScholar = true;
          }
          else if(extracurricularState){
               eligibleScholar = true;
          }

          if (eligibleScholar) {
               System.out.println("Your scholarship is passed!");
          }    
          else{
               System.out.println("Your are not eligible for scholership");
          }


          // Close the scanner
          s.close();


     }
}