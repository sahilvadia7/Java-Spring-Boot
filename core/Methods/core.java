package Methods;

// import java.lang.reflect.Method;

/**
 * Innercore
 */
class Innercore {
    void greeting(){
        System.out.println("i am from another class innercore");
    }
    
}

public class core {

    // Method Overloading   
    
    static int numbers(int a){
    System.out.println("Number is : "+a);
    return a;
    }


    static int numbers(int a,int b){
        a+=b;
        System.out.println("Number is : "+a);
        return a;
        }

    static int numbers(int a,int b,int c){
            a+=b+c;
            System.out.println("Number is : "+a);
            return a;
    }

    public static void main(String[] args) {
        

        numbers(100);
        numbers(100,30);
        numbers(100,30,40);
        Innercore ic = new Innercore();
        ic.greeting();
    }
}
