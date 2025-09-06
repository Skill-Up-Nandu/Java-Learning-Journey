import java.util.*;

class Logic{
    // Upper body
    void upper(int n){
        
        for(int i=1; i<=n; i++){
            // For Left Side's Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // For Space
            // (n*2)-(i*2) -> 2(n-i)
            for(int j=1; j<=(n*2)-(i*2); j++){
                System.out.print(" ");
            }
            // For Right Side's Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Lower body
    void lower(int n){

        for(int i=n; i>=1; i--){
            // for Left Side's Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // For Space
            for(int j=1; j<=(n*2)-(i*2); j++){
                System.out.print(" ");
            }
            // for Right side's Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
public class Butterfly{
    public static void main(String[] args){
        Logic obj = new Logic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Stars :  ");
        int star = sc.nextInt();
        obj.upper(star);
        obj.lower(star);
    }
}