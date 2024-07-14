package ad_java.enumss;

enum Status{

    RUNNING,
    PENDING,
    FAILED,
    SUCCESS;

}

public class SwitchEnums {
    

    public static void main(String[] args) {
        
    Status status = Status.FAILED;

    switch(status){
        case RUNNING:
            System.out.println("All Good");
            break;
        
        case PENDING:
            System.out.println("In Pending");
            break;

        case FAILED:
            System.out.println("Try Again");
            break;
        
        case SUCCESS:
            System.out.println("Process Done");
    }

    }

}
