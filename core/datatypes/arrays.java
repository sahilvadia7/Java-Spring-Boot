package datatypes;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner se=new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.print("Enter "+i+" value :");
            arr[i] = se.nextInt();
        }
        se.close();
        int j=0;
        while (j<5) {
            System.out.println(arr[j]);
            j++;
        }

    }
}
