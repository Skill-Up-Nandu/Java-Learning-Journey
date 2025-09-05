import java.util.*;

class Logic{
    void fun(){
        int w = 5;
        for(int i=w; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

public class InvertedTriangle {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.fun();
    }
}
