package datatypes;

public class dataTypes {

    static Boolean b=true;
    static char c='c';
    static byte by=10;
    static short sh=500;
    static int in=5000;
    static long lg=50000;

    static float f=11.12f;
    static double d=5555.20d;
    
    static String str= "this is demo of data type";
    static int[] arr={12,20,30,40,50,60};
    


    public static void main(String[] args) {
        

        System.out.println("DATA TYPES");
        System.out.println("---------------------------");
        System.out.println("PRIMITIVE DATA TYPES");

        System.out.println("1. Boolean DATA TYPES");
        System.out.println("Boolean :"+ b);

        System.out.println("2. Numeric DATA TYPES");

        System.out.println("A. Charactor DATA TYPES");
        System.out.println("Char DATA TYPES ");
        System.out.println("Char is :"+c);

        System.out.println("B. Integeral DATA TYPES");
        System.out.println("BA. Inter DATA TYPES");
        System.out.println("a. Bytes :"+by);
        System.out.println("b. Short is :"+sh);
        System.out.println("c. Int is :"+in);
        System.out.println("d. Long is :"+lg);

        System.out.println("BB. Floating Point DATA TYPES");
        System.out.println("a. Float :"+f);
        System.out.println("b. Double :"+d);
        

        System.out.println("NON-PRIMITIVE DATA TYPES");
        System.out.println("A. String Type :"+str);
        

        for(int loop=0; loop<=arr.length; loop++){
            System.out.println(arr[loop]);
        }

    }
}
