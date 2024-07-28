package ad_java.exceptions;

class microprocessor {

    public void ALU() throws ArithmeticException{
        int i = 12/0;
        System.out.println("Performs arithmetic operations"+i);
    }

    public void Registers(){
        System.out.println("Temporary data holding places within the microprocessor");
    }

    public void MMU(){
        System.out.println(" Manages memory allocation, protection, and virtual-to-physical address translation.");
    }
}

class SmartPhone extends microprocessor{
 
    public void micros() throws ArithmeticException{
        ALU();
        Registers();
        MMU();
    }

}

public class ThrowsExceptionn{
    public static void main(String[] args) {
       
        SmartPhone samsung = new SmartPhone();
        try {
            samsung.micros();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// throws exception it allow to thorws exception to other class who extends or used methods into 
// Own class now handle the exception it also called Ducking Exception
// PrintStackTrace() it give you stack exception

// at ad_java.exceptions.microprocessor.ALU(ThrowsExceptionn.java:6)
// at ad_java.exceptions.SmartPhone.micros(ThrowsExceptionn.java:22)
// at ad_java.exceptions.ThrowsExceptionn.main(ThrowsExceptionn.java:34)