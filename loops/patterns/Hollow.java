// package patterns;

import java.util.*;
class Logic{
    void fun(){
        int w = 5;
        int h = 8;
        for(int i=1; i<=w; i++){
            for(int j=1 ; j<=h ; j++){
                if(i == 1 || j == 1 || i == w || j == h){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
public class Hollow {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.fun();
    }
}
