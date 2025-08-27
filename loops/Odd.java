// Find the sum of all odd numbers between two given numbers.

import java.util.*;

class Logic{
    void cal(){
        Scanner sc =new Scanner(System.in);
        System.out.println("From :");
        int start = sc.nextInt();
        System.out.println("To : ");
        int end = sc.nextInt();
        int sum = 0 ;
        for(int i=start; i<= end; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("Totla : "+sum);
    }
}

public class Odd {
    public static void main(String[] args){
    Logic obj = new Logic();
    obj.cal();
    }
}
