import java.util.*;

class Logic{

    void fun(int n){

        for(int i=1; i<=n; i++){
            // for space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
public class SolidRhombus{
    public static void main(String[] args){
        Logic obj = new Logic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stars lenght : ");
        int star = sc.nextInt();
        obj.fun(star);
    }
}