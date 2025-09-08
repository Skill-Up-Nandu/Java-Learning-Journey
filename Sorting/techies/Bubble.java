package techies;
import java.util.*;

public class Bubble{
    public void logic(){
        System.out.println("BUBBLE SORT ->");
        int[] arr = {7,8,5,9,45,1,2};
        System.out.println("Unsorted Array : "+Arrays.toString(arr));

        // bubble sort

        // outer loop for passes (indices)
        for(int i=0; i<arr.length-1; i++){

            // inner loop for elements
            for(int j=0; j<arr.length-i-1; j++){

                // compare adjacent elements
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Time Complexity is O(n^2) // BAD ");
    }
}