package ad_java.multiplethreads;

// extends the Thread class for MultiThreading
class LeftFoot extends Thread{

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("lift the left");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void looking(){
        System.out.println("Looking Sky.");
    }

 
}


// extends the Thread class for MultiThreading
class RightFoot extends Thread{

    
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("lift the right");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}

public class MultiThreads {


    public static void main(String[] args) {
        LeftFoot left = new LeftFoot();
        RightFoot right = new RightFoot();

        right.start();
        left.start();

        //join() : Main thread waits for thread to finish. 
        try{
            right.join();
            left.join();
        }catch(Exception e){
            System.out.println(e);
        }
        left.looking();
    }
}


// This code manages multi-threading with the aim of achieving interleaved method execution.
// Here manage multi thrading but with little cath i want one-by-one method execution but non-deterministic nature of thread scheduling by the JVM.
// However, due to the non-deterministic nature of thread scheduling by the JVM, one thread (often the right thread) tends to execute almost entirely before the other.
// To mitigate this, the sleep method is used to provide the JVM with the opportunity to alternate between threads, allowing them to execute more simultaneously.
// The method looking() is executed before the threads start running because it is called in the main thread before the JVM fully hands over control to the newly started threads (left and right).
