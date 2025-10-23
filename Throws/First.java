import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Your age : ");
        int age =  sc.nextInt();
        
        // check if he is adult or not

        if (age <= 18 ) {
            throw new ArithmeticException("Age should be above 18");
        }
    }
}