package core;

public class sendMessage {
    void message(){
        System.out.println("?");
    }

    public static void main(String[] args) {
        sendMessage sm = new sendMessage();
        int i=0;
        while(i<10){
            sm.message();
            i++;
        }
    }

}
