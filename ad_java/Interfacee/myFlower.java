package ad_java.Interfacee;

/**
 * Flower
 */
interface Flower {
    void name();
    void colors();
    void fragrance();

    //java8 feature that allow to write abstract class with body
    default void origin(){
        System.out.println("Origin : JAPAN");
    }
}



class Rose implements Flower{

    public void name(){
        System.out.println("Flower : Rose");
    }
    public void colors(){
        System.out.println("Colors : Red, pink, white, yellow, orange, purple");
    }

    public void fragrance(){
        System.out.println("Fragrance : Sweet, floral, sometimes spicy");
    }

    public void origin(){
        System.out.println("Origin :INDIA");
    }
    
}


class Lavender implements Flower{

    public void name(){
        System.out.println("\nFlower : Lavender");
    }
    public void colors(){
        System.out.println("Colors : Purple, blue, white");
    }

    public void fragrance(){
        System.out.println("Fragrance : Fresh, sweet, herbal");
    }

    public void origin(){
        System.out.println("Origin : America");
    }
    
}



class Honeysuckle implements Flower{

    public void name(){
        System.out.println("\nFlower : Honeysuckle");
    }
    public void colors(){
        System.out.println("Colors : Yellow, white, pink, red");
    }

    public void fragrance(){
        System.out.println("Fragrance : Sweet, honey-like");
    }
    
}


class MyFav  {

    public void iLike(Flower f){
        f.name();
        f.fragrance();
        f.colors();
        f.origin();
    }

}



public class myFlower {
    public static void main(String[] args) {

        System.out.println("\nList of Flower\n");
        Flower f1 = new Rose(); 
        f1.name();
        f1.colors();
        f1.fragrance();
        f1.origin();

        Flower f2 = new Lavender();
        f2.name();
        f2.colors();
        f2.fragrance();
        f2.origin();

        Flower f3 = new Honeysuckle();
        f3.name();
        f3.colors();
        f3.fragrance();
        f3.origin();


        System.out.println("\nMy Favorite");
        MyFav m= new MyFav();
        m.iLike(f3);
    }
}
