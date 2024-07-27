package ad_java.enumss;

import extra.prime;

enum Laptop{
    HP(50000),ASUZE(40000),LENOVO(60000),MAC(100000);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class EmunsLaptop {
    public static void main(String[] args) {
        
        // Laptop lap = Laptop.ASUZE;
        // // lap.setPrice();
        // System.out.println(lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap+" :"+lap.getPrice());
        }
        
    }
}
