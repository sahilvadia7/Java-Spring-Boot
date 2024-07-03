// Scenario: Gym Membership Eligibility Checker
// A gym offers a special membership based on the following criteria:

// The person must be at least 18 years old.
// The person must have a monthly income of at least $2,500.
// If the person is older than 60, they automatically qualify for the membership regardless of income.
// If the person has a referral from an existing member, the income requirement is reduced to $2,000.
// If the person has a valid student ID, the age requirement is reduced to 16, and the income requirement is reduced to $1,500.

package core.conditional_statement;

import java.util.Scanner;

public class Gym {

    public static void main(String[] args) {
        int age,income;
        String referral,studentId;
        boolean referralstatus,studentIdStatus,membershipEligible=false;
        Scanner getin = new Scanner(System.in);

        System.out.print("Enter Age :");
        age = getin.nextInt();

        System.out.print("Enter Monthly income :"); 
        income = getin.nextInt();

        System.out.print("Do you have any referral (yes/no):");
        referral= getin.next();
        referralstatus = referral.equalsIgnoreCase("yes");

        System.out.print("Do you have Student ID (yes/no):");
        studentId= getin.next();
        studentIdStatus = studentId.equalsIgnoreCase("yes");


        if (age == 18 ) {
            if (income >= 2500) {
                membershipEligible = true;
            }
            else if(referralstatus){
                if (income >= 2000) {
                    membershipEligible = true;
                }
                else{
                    membershipEligible = false;
                }
            }

            
        }
        else if(studentIdStatus){
            if (income>=1500) {
                membershipEligible = true;
                
            }
            else{
                membershipEligible = false;
            }
        }
        if (age > 60) {
            membershipEligible = true;
        }

        if (membershipEligible) {
            System.out.println("you are eligible to enroll in Gym");
        }
        else{
            System.out.println("sorry, your not eligible to Gym");
        }


    }
}
