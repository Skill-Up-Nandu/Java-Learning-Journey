import java.util.*;

class Simple{
    void age_check(){
    System.out.println("Tell me your age : ");
    Scanner sc = new Scanner(System.in);
    Float age = sc.nextFloat();
    if(age >= 18){
            System.out.println("Go Ahead ! , You can vote.");
        }
        else{
            System.out.println("Stop! , You are not an adult.");
        }
    }
        
}
public class Conditions{
    public static void main(String[] args){
        System.out.println("This is an EVM.");
        Simple obj = new Simple();
        obj.age_check();
        
    }
}