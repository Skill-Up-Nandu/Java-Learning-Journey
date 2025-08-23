import java.util.* ;

public class Scan{
    public static void main(String[] args){
        System.out.println("Printing values using 'Scanner class' : ");
        Scanner sc = new Scanner(System.in);

        // Reading String Variable
        System.out.println("Enter Your Full Name : ");
        String name = sc.nextLine(); 
        

        // Reading Integer Variable
        System.out.print("Write down your age : ");
        int age = sc.nextInt();

        // Reading Floating Variable
        System.out.println("Enter your Exact Weight : ");
        float wgt = sc.nextFloat();

        // Printing Values
        System.out.println("Hi! , My name is "+name);
        System.out.println("I'm "+age+" years old.");
        System.out.println("My Weigth is "+wgt+" kg.");
    }
 }