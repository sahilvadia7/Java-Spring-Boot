//implement a number-guessing game where past guesses are stored in an `ArrayList` and displayed after each attempt.

package list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class attempt{
    private int no;
    private String result;

    public attempt(int no, String result) {
        this.no = no;
        this.result = result;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "attempt{" +
                "no=" + no +
                ", result='" + result + '\'' +
                '}';
    }
}
enum result_tag {
    WIN,
    LOSE,
}

public class problem4 {
    static Scanner in = new Scanner(System.in);
    static List<attempt> attempts = new ArrayList<>();

    public static void main(String[] args) {
        result_tag Win = result_tag.WIN;
        result_tag Lose = result_tag.LOSE;
        int userNo;

        Random random = new Random();
        int opt;

        do{
            System.out.println("Winning Chance");
            System.out.println("1. 50% (0-1)  :");
            System.out.println("2. 10% (0-10) :");
            System.out.println("3. 1% (0-100) :");
            System.out.print("Select opt: ");
            opt = in.nextInt();

            switch (opt){

                case 1:
                    int rand_int1 = random.nextInt(2);
                    userNo = userInput();
                    System.out.println("\t"+"Computer: "+rand_int1);
                    if(rand_int1 == userNo ){
                        attempts.add(new attempt(userNo,"Win"));
                        System.out.println("\t"+Win+"\n");
                    }else{
                        attempts.add(new attempt(userNo, "Lose"));
                        System.out.println("\t"+Lose+"\n");
                    }
                    showAttempt();
                    break;

                case 2:
                    int rand_int2 = random.nextInt(11);
                    userNo = userInput();
                    System.out.println("\t"+"Computer: "+rand_int2);
                    if(rand_int2 == userNo ){
                        attempts.add(new attempt(userNo,"Win"));
                        System.out.println("\t"+Win+"\n");
                    }else{
                        attempts.add(new attempt(userNo, "Lose"));
                        System.out.println("\t"+Lose+"\n");
                    }
                    showAttempt();
                    break;

                case 3:
                    int rand_int3 = random.nextInt(101);
                    userNo = userInput();
                    System.out.println("\t"+"Computer: "+rand_int3);
                    if(rand_int3 == userNo ){
                        attempts.add(new attempt(userNo,"Win"));
                        System.out.println("\t"+Win+"\n");
                    }else{
                        attempts.add(new attempt(userNo, "Lose"));
                        System.out.println("\t"+Lose+"\n");
                    }
                    showAttempt();
                    break;
            }
        }while(opt!=0);


    }

    private static void showAttempt() {

        System.out.println("No Of Attempt");
        attempts.forEach(System.out::println);
    }

    public static int userInput(){
        int i;
        System.out.print("\t"+"Guess Number: ");
        return i = in.nextInt();
    }

}
