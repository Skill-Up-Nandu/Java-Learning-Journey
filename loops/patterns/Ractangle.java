import java.util.*;

class Logic{
    void fun(){
        int w = 4;
        int h = 5;
        for(int i=1; i<=w; i++){
               for(int j=1; j<=h; j++){
                System.out.print("* ");
               }
               System.out.println(" ");
        }
    }
}

public class Ractangle{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.fun();
}
}