import java.util.Scanner;

public class Second {

    public static void checkAge(int age) throws ArithmeticException {

        if (age < 18){
            System.out.println("Acess Denied : Yu must be atleast 18");
        }
        else {
            System.out.println("Access Granted : You are old enough.");
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Your age : ");
        int age =  sc.nextInt();

        try {
            checkAge(age);
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught : "+e.getMessage());
        }
        System.out.println("Program Executes normaly ->");
        

    }
} 
