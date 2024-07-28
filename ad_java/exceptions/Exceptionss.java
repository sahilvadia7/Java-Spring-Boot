package ad_java.exceptions;

public class Exceptionss {


    static int j ;
    public static void main(String[] args) {
        
        try{
            j = 5/20;
            if(j==0){
                throw new ArithmeticException("J Value is Zero, Message passing form Calling Method using throw Keyword");
            }
        }
         catch(ArithmeticException e){
            System.out.println("Exception : "+e);
        } 

    }
}


// It will generate the exception {java.lang.ArithmeticException: / by zero}
// int i=0;
// int j = 10;
// j = j/i;
// System.out.println(j);
// handle the exception using try, catch block

// also we create exception and call respective class to handle the exception 
// Using throw keyword we are creating exception 
// Ex: throw new ArithmeticException("J Value is Zero, Message passing form Calling Method using throw Keyword");
// keywors new ExceptionHandling class Also it call the method so you can pass the message form here
// It show while catch block handle the exception 
// While catching exception also you can print your own message 
// Or show system generated message using Exception e : object 'e' 
// Ex: System.out.println("Exception : "+e);