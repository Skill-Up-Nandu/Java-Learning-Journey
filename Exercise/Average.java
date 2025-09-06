import java.util.*;

public class Average {

    public static int calAverage(int a, int b, int c) {
        int sum = a+b+c;
        return sum/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter three values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        System.out.println("Average : "+ calAverage(a, b, c)); 
    }
}
