package ad_java.innerClass;

/**
 * InnerinnerClass
 */
class InnerinnerClass {

    void show(){
        System.out.println("Showing data");
    }

    /**
     *  SecondInner
     */
    public class  SecondInner {
    
        void display(){
            System.out.println("Display the data");
        }
        
    }
}

public class innerClass {
    public static void main(String[] args) {
        InnerinnerClass ic =new InnerinnerClass();
        ic.show();

        // main-class.Second-class  obj = MainObj.new SecondClass();
        InnerinnerClass.SecondInner icsi = ic.new SecondInner();
        icsi.display();
    }
}
