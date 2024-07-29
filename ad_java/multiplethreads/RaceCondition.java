package ad_java.multiplethreads;


class Counter {

    int count;
    public synchronized void increment(){
        System.out.println(count++);
    }

}
class Hey implements Runnable {

    Counter c = new Counter();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
          c.increment();
        }
    }
}

class Hola implements Runnable {
    Counter c = new Counter();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class RaceCondition {
    public static void main(String[] args) {
        Runnable hola = new Hola();
        Runnable hey = new Hey();
              
        Thread t1 = new Thread(hola);
        Thread t2 = new Thread(hey);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }

       

    }
    
}
