package ad_java.multiplethreads;

// Implemetns the Runnable class for MultiThreading
// class LeftFoot implements Runnable{

//     @Override
//     public void run(){
//         for(int i=0; i<10; i++){
//             System.out.println("lift the left");
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

// }

// Implemetns the Runnable class for MultiThreading
class RightFoot implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("lift the right");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runnablee {

    public static void main(String[] args) {

        // using Lambda expresion
        Runnable left = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("lift the left");
                try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
            }

        };
        Runnable right = new RightFoot();

        Thread t1 = new Thread(left);
        Thread t2 = new Thread(right);

        t1.start();
        t2.start();
    }
}
