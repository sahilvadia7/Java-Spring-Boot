// Scenario: Student Performance Tracker
// A school wants to track student performance based on their scores in multiple subjects. The program should:

// Calculate the average s
// Determine the grade based on the average score using a switch statement.
// Check if the student has failed any subject (a score below 40 is considered failing).
// Print a warning message and continue if a subject score is below 50.
// If the student has failed more than 2 subjects, immediately mark them as failing and break out of the loop.


package conditional_statement;

import java.util.Scanner;

public class StudentPerformanceTracker {

   public static void main(String[] args) {
    StudentReport studentReport = new StudentReport();
    studentReport.marksheet();

   }
}

/**
 * StudentReport
 */
class StudentReport {

    double[] marks=new double[5];
    String[] subjects = {"Math", "English", "History", "Science", "Art"};
    String name;
    double avg,total = 0;
    int failsubjectCounter = 0;
    boolean instantFail=false;
    Scanner input = new Scanner(System.in);

    void marksheet(){
        System.out.print("Enter Student Name: ");
        name = input.next();

       for(int j=0; j<subjects.length; j++){
            System.out.print("Enter "+subjects[j] +" marks: ");
            marks[j] = input.nextDouble();

            if(marks[j] < 40){
                failsubjectCounter++;
                if (failsubjectCounter >2) {
                    instantFail = true;
                    break;
                }
            }

            if(marks[j] < 50){
                System.out.println("Warning: Score in " + subjects[j] + " is below 50.");
                continue;
            }

            total += marks[j];
        }

        if(!instantFail){
            avg = total/marks.length;

              // Determine grade based on average score
              char grade;
              switch ((int) avg / 10) {
                  case 10:
                     grade = 'O';
                     break;
                  case 9:
                      grade = 'A';
                      break;
                  case 8:
                      grade = 'B';
                      break;
                  case 7:
                      grade = 'C';
                      break;
                  case 6:
                      grade = 'D';
                      break;
                  default:
                      grade = 'F';
                      break;
              }

                System.out.println("Student Name :"+ name);
                System.out.println("Average score is :"+avg);
                System.out.println("Grade :"+grade);

        }
        else{
            System.out.println("You are fail in morethan 2 subjects");
        }


    }
}