import java.util.*;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        System.out.println(Arrays.toString(arr));

        int n = 4;
        int element = 200;

        for (int i=n; i<= arr.length; i++){
            arr[i]= arr[i+1];
        }
    }
}