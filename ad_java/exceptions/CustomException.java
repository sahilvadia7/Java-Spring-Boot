package ad_java.exceptions;

class Emergency extends Exception{

    public Emergency(String str){
        super(str);
    }
}

class Car{

    
    public String Accident(){
        return "In danger";
    }

   
    public String Location(){
        return "17th Cross Road, Near parm Hotel";
    }   
}

public class CustomException {

    public static void main(String[] args) {
        
        Car audi = new Car();

        try{

            if (audi.Accident().equalsIgnoreCase("in danger")) {
                throw new Emergency(audi.Location());
            }
        }
        catch(Emergency e){
            System.out.println("Accident : "+e);
        }
        
    }
    
}

// CUSTOM EXCEPTION
// here, i make the sence of accident.
// Car has method Accident & Location.
// Now in the if we call accident method and compair it with static string
// it means it true the if condition, go into if call the custom exception class
// Emergency also passing message as a stirng by calling the car location method
// it will call the constructor of Emergency class it extends the Main Exception class
// Exception class have method they take string and return to object 
// only you pass the string using super keyword after the taking string 
// Exception class handle it and show that message while calling obj Emergency 'e'
// catch(Emergency e){
//     System.out.println("Accident : "+e);
// }