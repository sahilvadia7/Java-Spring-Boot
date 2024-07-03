package core.Strings;

public class whileLoop {
    public static void main(String[] args) {
        System.out.println("While");
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }


        System.out.println("Do-while");
        i=0;
        do{
            System.out.println(i);
            i++;
        }while (i<10);


        System.out.println("ForLoop");

        for ( i=0;i<10;i++){
            System.out.println(i);
        }


        System.out.println("ForEach");
        int[] arr={1,2,3,4,5};
        for(int a: arr){
            System.out.println(a);
        }
    }
}
