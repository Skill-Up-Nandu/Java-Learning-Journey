import java.util.*;

class Logic{
    void fun(int n){

        for(int i=1; i<=n; i++){
            // for space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // for left pyramid
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // for right pyramid
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
public class Palindrom{
    public static void main(String[] args){
        Logic obj = new Logic();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want : ");
        int rows = sc.nextInt();
        obj.fun(rows);
    }
}