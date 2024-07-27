package extra;

import java.util.Scanner;

public class prime{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total numbers : ");
        int n = sc.nextInt();
        
        System.out.println("Enter the Numbers : ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The Prime Numbers : ");
        for (int i = 0; i < n; i++) {
            boolean isPrime = true; 
            if (numbers[i] <= 1) {
                isPrime = false; 
            }
            for (int j = 2; j * j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(numbers[i]);
            }
        }
    }
}