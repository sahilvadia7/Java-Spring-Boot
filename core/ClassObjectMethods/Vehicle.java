package core.ClassObjectMethods;

public class Vehicle {

    private String vehicleName;
    private int passengerCount;
    private int fuelCap;
    private int KPL;


    //creating vehicle demo class for minivan & bus
    static class vehicleDemo{
        public static void main(String[] args) {

            //obj of vehicle class
            Vehicle minivan = new Vehicle();

            //initialize values
            minivan.vehicleName = "minivan";
            minivan.passengerCount = 5;
            minivan.fuelCap = 10;
            minivan.KPL = 50;

            //calling method and passing variables
            CarInfo(minivan.vehicleName,minivan.passengerCount, minivan.fuelCap, minivan.KPL);



            Vehicle Bus = new Vehicle();
            Bus.vehicleName = "Bus";
            Bus.passengerCount = 50;
            Bus.fuelCap = 100;
            Bus.KPL = 25;
            CarInfo(Bus.vehicleName, Bus.passengerCount, Bus.fuelCap, Bus.KPL);


        }
    }
    //for more than one vehicle we make more used more object,variables,print statements
    //for that we creat method that give us every data we want without making new variables and object or print statement
    //so we create CarInfo() method that ask to 3 variable passenger-count,fuelCap,Kpl


    //method to take input and print data void type not return anything
    public static void CarInfo(String vehicleName,int passengerCount, int fuelCap, int KPL){
        System.out.println("\nvehicle Name : " + vehicleName);
        System.out.println("Passenger Count: "+passengerCount);
        System.out.println("FuelCap: "+fuelCap);
        System.out.println("KPL: "+KPL);
        System.out.println("Range: "+fuelCap* KPL);

    }

}
