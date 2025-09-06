import java.util.*;

class Logic{
    void fun(){
        int w =5;
        int num = 1;

        for(int i=1; i<=w; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
    }
}
public class Floyd{
    public static void main(String[] args){
        Logic obj = new Logic();
        obj.fun();
    }
}