package ad_java.collection.arrays_collections_class;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int index = Arrays.binarySearch(arr, 4);
        System.out.println(index);

        int arr1[] = {2,5,1,2,4,5,6};
        System.out.println("Sorted Array:");
        Arrays.sort(arr1);

        for(int i: arr1){
            System.out.println(i);
        }
    }
}
