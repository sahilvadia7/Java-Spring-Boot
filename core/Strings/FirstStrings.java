package core.Strings;

import java.util.Scanner;

public class FirstStrings {
    public static void main(String[] args) {

//        StringMethod();
//        MathFunction();
//        NumberGuessGame();

//        int result = RecursionSum(12);
//        System.out.println(result);


        int result2 = RecursionFactorial(5);
        System.out.println(result2);


        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }

    private static int RecursionFactorial(int i) {
        if(i>0){
            return i*RecursionFactorial(i-1);
        }
        else {
            return 1;
        }
    }

    private static int RecursionSum(int k) {
        if(k>0){
            return k+RecursionSum(k-1);

        }else {
            return 0;
        }


    }

    private static void NumberGuessGame() {
        System.out.print("Enter number 0-10: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int Computer = (int) (Math.random() * 10 +1 );
        System.out.println(Computer);

        if (number == Computer) {
            System.out.println("You guess is right");
        }
        else {
            System.out.println("You guess is wrong");
        }

    }

    private static void MathFunction() {
       int a=10,b=5;

        System.out.println("MAX function");
        System.out.println(Math.max(a,b));

        System.out.println("Random number generator");
        System.out.println((int)(Math.random() * 101));



    }

    private static void StringMethod() {


        System.out.println("length of strings");
        String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(str.length());


        System.out.println();
        System.out.println("Upper case / Lower case");
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println();
        System.out.println("Index of character");
        System.out.println(str.indexOf("F"));


        System.out.println();
        System.out.println("Example of Concatenation");
        System.out.println("Concate"+"nation");
    }
}
