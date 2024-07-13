package ad_java.annonymousClass;


abstract class SmartPhone {

    abstract void camera();
    abstract void socialMedia();
    
}
public class AnnonymousAbstract {
    
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone() {
            void camera(){
                System.out.println("Clicking images");
            }

            void socialMedia(){
                System.out.println("Making friends online");
            }
        };

        sp.camera();
        sp.socialMedia();
    }
}
