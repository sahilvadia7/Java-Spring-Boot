package ad_java.enumss;

enum Status{
    Running,Failed,Pendling,Success;
}
public class enumsDemo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);


        Status[] arr=Status.values();

        System.out.println();
        for(Status a: arr){
            System.out.println(a);
        }
    }
}
