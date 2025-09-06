import java.util.*;

class Logic{
    void fun(int n){

        for(int i=1; i<=n; i++){
            // for space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // for numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
public class NumberPyramid{
    public static void main(String[] args){
        Logic obj = new Logic();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want : ");
        int rows = sc.nextInt();
        obj.fun(rows);
    }
}