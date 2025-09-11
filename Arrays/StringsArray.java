// Create a String array from user input and find the cumulative (combined) lenght of all those strings

import java.util.*;

class Logic{

    Scanner sc = new Scanner(System.in);
    int size;

    Logic(int s){

        size = s;
    }

    int createArray(){

        String[] sentance = new String[size];
        int total = 0;
        
        System.out.println("Enter Your Sntance : ");

        for(int i=0; i<size ; i++){

            sentance[i] = sc.next();
            total += sentance.length;
        }
        return total;
    }
}
public class StringsArray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        
        Logic obj = new Logic(size);
        int totalLength = obj.createArray();
        System.out.println(totalLength);
        
        }
}