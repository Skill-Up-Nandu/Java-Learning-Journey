import java.util.*;

public class Conditions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an EVM.");
        System.out.println("Tell me your age : ");
        Float age = sc.nextFloat();
        if(age >= 18){
            System.out.println("Go Ahead ! , You can vote.");
        }
        else{
            System.out.println("Stop! , You are not an adult.");
        }
        
    }
}