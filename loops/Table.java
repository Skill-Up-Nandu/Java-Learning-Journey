// Input a number x and print its multiplication table up to 10

import java.util.*;

class Logic{
    Scanner sc = new Scanner(System.in) ;
    void table(){
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
        
    }
}

public class Table {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.table();
    }
}
