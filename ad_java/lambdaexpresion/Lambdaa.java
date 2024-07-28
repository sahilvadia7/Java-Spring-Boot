package ad_java.lambdaexpresion;

interface Nums {
    void Numbers(int i);    
}


@FunctionalInterface
interface Cal {
    String add(String a,int b);
}

public class Lambdaa {
    public static void main(String[] args) {

        // Define lambdaexpresion
        // 1. way
        Nums obj1= (int a) ->{
            System.out.println("nums : "+a);
        };
        obj1.Numbers(11);


        //2. way
        Nums obj2 = (int a) -> System.out.println("nums : "+a);
        obj2.Numbers(10);
 
        //3. way
        Nums obj3 = a -> System.out.println("nums : "+a);
        obj3.Numbers(20);


        //4. way
        Nums obj4 = System.out::println;
        obj4.Numbers(13);


        //returning value 
        Cal cal = (a,b) -> a+b;
        String result = cal.add("BMW M", 5);
        System.out.println(result);

    }
}
