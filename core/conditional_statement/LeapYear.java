package core.conditional_statement;

import java.util.Scanner;

public class LeapYear {
    static int year;
    static boolean leap=false;
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);

        System.out.print("Enter the Year :");
        year = se.nextInt();


        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                leap = true;
            }
        }

        if (leap) {
            System.out.println("The Year of "+year+" is leap year !");
        }
        else{
            System.out.println("It is not Leap Year :(");
        }
    }
}
