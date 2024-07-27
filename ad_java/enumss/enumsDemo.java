package ad_java.enumss;

public class enumsDemo {
    public static void main(String[] args) {
        Status s = Status.RUNNING;
        System.out.println(s);


        Status[] arr=Status.values();

        System.out.println();
        for(Status a: arr){
            System.out.println(a);
        }
    }
}
