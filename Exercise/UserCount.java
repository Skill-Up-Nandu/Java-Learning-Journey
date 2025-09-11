import java.util.*;
public class UserCount{
    public static void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter few RANDOM integers (-1000 to 1000) : ");
        int[] arr ;
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        userInput();
    }
}