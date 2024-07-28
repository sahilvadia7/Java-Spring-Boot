package ad_java.annotation;

class Printer{
    public void PrintingCopy(){
        System.out.println("Printing....");
    }
}




class Press extends Printer {

    // try to override method form Printer but we make mistake to override not write proper name so it seen to new method
    // programming error done while the developing so use Annotation to overcome compiler give you warnning if you write worng
    // also you create your own Annotation and use in the code it will have different level of execution
    public void Printingcopy(){
        System.out.println("Print-Press Printing...");
    }

    @Override
    public void PrintingCopy(){
        System.out.println("Real-press printing...");
    }
}

public class annotaion {

    public static void main(String[] args) {

        //here we are trying to call override method of Printer
        Press p = new Press();
        p.PrintingCopy();
    }
    
}
