package ad_java.abstractKeyWord;


/**
 * Innerabstractt
 */
abstract class Car {

    abstract void drive();
    abstract void fuel();
    
}


/**
 *  GwagonR 
 */
class  G_wagonR extends Car {

    void drive(){
        System.out.println("Drive at 100/KMPH");
    }

    void fuel(){
        System.out.println("3/5 fuel in tank");
    }
    
}
public class abstractt {
    
    public static void main(String[] args) {
    
    G_wagonR gr = new G_wagonR();
    gr.drive();
    gr.fuel();
    
    }
}
