import java.util.*;

class Logic{
    void fun(){
        int w = 10;
        for(int i=1; i<=w; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
public class TriangleRight {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.fun();
    }
}
