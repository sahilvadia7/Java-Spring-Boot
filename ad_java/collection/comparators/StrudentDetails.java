package ad_java.collection.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrudentDetails {

    public static void main(String[] args) {
        
         List<Students> studs = new ArrayList<>();
         studs.add(new Students(18, 1,"Sahil"));
         studs.add(new Students(22, 4,"Ankit"));
         studs.add(new Students(21, 3,"Nikhil"));

       
         Comparator<Students> comp = new Comparator<Students>() {

            @Override
            public int compare(Students arg0, Students arg1) {
                if(arg0.getAge()>arg1.getAge()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            
         };

         Collections.sort(studs,comp);
         for(Students s: studs){
            System.out.println(s);
         }
        }
    
}
