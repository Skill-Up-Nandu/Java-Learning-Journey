// print 1 to 100 natural numbers
import java.util.*;

class Logic{
    void cal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Natural Numbers :");
        System.out.println("From : ");
        int start = sc.nextInt();
        System.out.println("To : ");
        int end = sc.nextInt();
        for(int i = start ; i <=end ; i++){
            System.out.println(i);
        }
}
}

public class Natural {
    public static void main(String[] args){
    Logic obj = new Logic();
    obj.cal();
    }    
}
