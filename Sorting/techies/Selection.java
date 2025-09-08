package techies;
import java.util.*;

public class Selection{
    public void logic(){
        System.out.println("SELECTION SORT ->");
        int[] arr = {9,2,7,8,10};
        System.out.println("Unsorted Array : "+Arrays.toString(arr));

        // Selection sort

        // outer loop for access indices
        for(int i=0; i<arr.length-1; i++){

            int smallest = i;

            // inner loop for access elements
            for(int j=i+1; j<=arr.length-1; j++){
                
                // finding the smallest element
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            // swap values
            int temp = arr[smallest];
            arr[smallest] = arr[i] ;
            arr[i] = temp;
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
        System.out.println("Time Complexity is O(n^2) // BAD");
    }
}