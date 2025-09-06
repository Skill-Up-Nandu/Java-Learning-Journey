import java.util.*;

class Logic{
    void fun(int n){
        // for upper body
        for(int i=1; i<=n; i++){
            // for space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // for lower body
        for(int i=n; i>=1; i--){
            // for space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=2; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}

public class Diamond{
    public static void main(String[] args){
        Logic obj = new Logic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the largest number for pyramid : ");
        int num = sc.nextInt();
        obj.fun(num);
    }
}