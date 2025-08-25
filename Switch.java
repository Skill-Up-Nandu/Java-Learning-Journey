import java.util.*;

class SelectPack{

    void rechrges(){
        
        int[] packs = {199,399,599};
        System.out.println("Available Recharge Packs : ");
        for(int i=0 ; i < packs.length; i++){
            System.err.println((i+1)+". Rs."+packs[i]+" Pack");
        }
        
    }

    void choices(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
    }

    void display(){
        System.out.println("Welcome to Mobile Recherge System");

    }
        
}

public class Switch {
    public static void main(String[] args){
    SelectPack obj = new SelectPack(); 
    obj.display();
    obj.rechrges(); 
    obj.choices();
    }    
}
