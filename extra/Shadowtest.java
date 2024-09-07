package extra;

/**
 * InnerShadowtest
 */
class InnerShadowtest {

    private void printer(){
        System.out.println("Printer");
    }
    
}

/**
 * InnerShadowtest_1
 */
class InnerShadowtest_1 extends InnerShadowtest{

    private void printer(){
        System.out.println("Printer1");
    }
    
}

public class Shadowtest {
    public static void main(String[] args) {
        InnerShadowtest ist = new InnerShadowtest();
        InnerShadowtest_1 ist1 = new InnerShadowtest_1();
        
    }
}
