import java.util.*;

public class SumNandini{

    public static void main(String[] args){

        if(args.length != 10){
            System.out.println("Enter Exact 10 numbers.");
            return;
        }

        int sum = 0;
        for(int i =0; i<args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("TOTAL IS : "+sum);
    }
}