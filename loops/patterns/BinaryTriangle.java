import java.util.*;

class Logic{

    // Left Triangle
    void left(){
        int w=5;
        
        for(int i=1; i<=w; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

    // Right Triangle
    void right(){
        int w=5;

        for(int i=1; i<=w; i++){
            // For Space
            for(int j=1; j<=(w-i); j++){
                System.out.print(" ");
            }
            // For Binary
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}

public class BinaryTriangle{
    public static void main(String[] args){
        Logic obj = new Logic();
        obj.left();
        System.out.println("");
        obj.right();
    }
}
