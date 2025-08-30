// Find factorial using a loop 
import java.util.*;

class Logic{
    Scanner sc = new Scanner(System.in);

    void fact(){
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = 1;
        for(int i=1; i<=num; i++){
            result =  result*i;
        }
        System.out.println("Factorial of "+num+" is "+result);
    }
}


public class Factorial {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.fact();
    }
}
