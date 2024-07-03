package core;

/**
 * car
 */
public class BasicSyntax {

    public static void main(String[] args) {
        System.out.println("heheh");


        //create object of subclass 
        subClass sc=new subClass();

        // calling method by using class object
        sc.printer();
    }
}

//sub-class
class subClass{
    void printer(){
        System.out.println("hi i am printer method form subclass");
    }
}