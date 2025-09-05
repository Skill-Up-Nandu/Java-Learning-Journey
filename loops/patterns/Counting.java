import java.util.*;

class Logic{
    Scanner sc = new Scanner(System.in);
    // rectangle
    void rectangle(){
        System.out.println("Rectangle of Numbers : ");
        System.out.println("Enter number of rows : ");
        int w = sc.nextInt();
        System.out.println("Enter number of collumns  : ");
        int h = sc.nextInt();

        // logic for rectangle
        for(int i=1; i<=w; i++){
            for(int j=1; j<=h; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }     
    }
    
    // Hollow Rectangle
    void hollowRectangle(){
        System.out.println("Hollow Rectangle of Numbers : ");
        System.out.println("Enter number of rows : ");
        int w = sc.nextInt();
        System.out.println("Enter number of collumns  : ");
        int h = sc.nextInt();

        // Logic
        for(int i=1; i<=w; i++){
            for(int j=1; j<=h; j++){
                if(i==1 || j==1 || i==w || j==h){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    // Right Triangle
    void rightTriangle(){
        System.out.println("Right Triangle of Numbers : ");
        System.out.println("Enter number of rows : ");
        int w = sc.nextInt();

        // Logic
        for(int i=1; i<=w; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    // Inverted Right Triangle
    void invertedRightTriangle(){
        System.out.println("Inverted Right Triangle of Numbers : ");
        System.out.println("Enter number of rows : ");
        int w = sc.nextInt();

        // Logic
        for(int i=w; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }    
}
public class Counting {
    public static void main(String[] args) {
        Logic obj = new Logic();
        // obj.rectangle();
        // obj.hollowRectangle();
        // obj.rightTriangle();
        obj.invertedRightTriangle();
    }
}
