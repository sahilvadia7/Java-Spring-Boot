package ad_java.Interfacee;

// @FunctionalInterface it is annotation it check only one method allow into interface 
// functional interface is type of interface that only have single method
// if you want to write functional interface but you declear morethan one 
// usinf @FunctionalInterface Annotation compiler give it to you warrning about 
// Now your interface not longer functional interface 
// So it Good to use in every time if you want to write Functional Interface



@FunctionalInterface
interface Cars {
    void Model();
}

class BMW implements Cars {

    public void Model(){
        System.out.println("BMW M5");
    }
      
}

public class FunctionalInterfacee {

    public static void main(String[] args) {
     
        //normal calling class using Object

        BMW m5 = new BMW();
        m5.Model();

        // creating anonymous class in it we dont need childe class for calling override mehtod
        // here we diractly making anonymous class using interface object

        Cars m3 = new Cars(){
            public void Model(){
                System.out.println("BMW M3");
            }
        };

        m3.Model();

        // Lambda Expresion
        Cars m7 = () -> System.out.println("BMW M7");
        m7.Model();


    }
    
}
