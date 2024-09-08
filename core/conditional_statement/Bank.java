
// In this scenario, a bank wants to determine if a person is eligible for a loan based on certain conditions:

// The person must be at least 18 years old.
// The person must have a minimum monthly income of $2,000.
// If the person has a credit score of 700 or higher, they automatically qualify for the loan regardless of age and income.

package conditional_statement;

import java.util.Scanner;


public class Bank {
       public static void main(String[] args) {
     

        Costomer costomer=new Costomer();
        costomer.CostomerDetails();
        costomer.Loan();
    


    }
}

/**
 * InnerBank
 */
class Costomer {
    static String Name;
    static int creditScore,income,age;



    void CostomerDetails(){
        Scanner scanner=new Scanner(System.in);
      

        System.out.print("Enter Costomer Name :");
        Name = scanner.next();

        System.out.print("Enter Costomer Age :");
        age = scanner.nextInt();

        System.out.print("Enter montly income :");
        income = scanner.nextInt();

        System.out.print("Enter credit score :");
        creditScore = scanner.nextInt();

        scanner.close();
    }

    void Loan(){
        boolean eligibleForLoan = false;

        if(creditScore > 700){
            eligibleForLoan = true;
        }
        else if(age >= 18 && income>2000){
            eligibleForLoan = true;
        }

        if (eligibleForLoan) {
            System.out.println("you are eligible for Loan");
        }
        else{
            System.out.println("Sorry you are not eligible for Loan");
        }
    }
    
}