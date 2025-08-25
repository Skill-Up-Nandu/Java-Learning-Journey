import java.util.*;

class SelectPack{

    void rechrges(){
        
        int[] packs = {199,399,599};
        System.out.println("Available Recharge Packs : ");
        for(int i=0 ; i < packs.length; i++){
            System.err.println((i+1)+". Rs."+packs[i]+" Pack");
        }
        
    }

    int choices(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To check details enter price");
        int choice = sc.nextInt();
        return choice;
    }

    // void select(){
    //     System.out.println('Write "OK" to confirm');
    // }
    void plan599(){
        System.out.println("You have selected Rs.599 Pack");
        System.out.println("Plan Details - ");
        System.out.println("- 3GB/day Data");
        System.out.println("- Validity 84 days");
        System.out.println("- Unlimited calls");
        System.out.println("- 100 SMS/day");
    }


    void plan399(){
        System.out.println("You have selected Rs.399 Pack");
        System.out.println("Plan Details - ");
        System.out.println("- 2GB/day Data");
        System.out.println("- Validity 56 days");
        System.out.println("- Unlimited calls");
        System.out.println("- 100 SMS/day");
    }

    void plan199(){
        System.out.println("You have selected Rs.199 Pack");
        System.out.println("Plan Details - ");
        System.out.println("- 1.5GB/day Data");
        System.out.println("- Validity 28 days");
        System.out.println("- Unlimited calls");
        System.out.println("- 100 SMS/day");
    }
    void switchCases(int x){
        switch (x) {
            case 199: plan199();                
                break;
            case 399: plan399();
                break;
            case 599: plan599();
                break;
            default:
                break;
        }
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
    int choice = obj.choices();
    obj.switchCases(choice);
    }    
}
