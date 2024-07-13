package ad_java.annonymousClass;


class Cycle{

    void paddle(){
        System.out.println("paddling the cycle");
    }
}

public class anonymouss {
    public static void main(String[] args) {
        Cycle c =new Cycle(){
            void paddle(){
                System.out.println("paddling the cycle form main");
            }
        };


        c.paddle();
    }
}
