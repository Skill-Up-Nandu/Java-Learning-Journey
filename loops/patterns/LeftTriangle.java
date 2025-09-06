import java.util.*;

class Logic{

    void fun(){
        int w = 5;
        for(int i=1; i<=w; i++){
            // For Space
            for(int j=1; j<=(w-i); j++){
                System.out.print(" ");
            }
            // For Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}


public class LeftTriangle{
    public static void main(String[] args){
        Logic obj = new Logic();
        obj.fun();
    }
}