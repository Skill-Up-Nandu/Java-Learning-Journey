import java.util.*;

class SelectPack{
    void display(){
        int[] packs = {199,399,599};
        for(int i=0 ; i < packs.length; i++){
            System.err.println((i+1)+". Rs."+packs[i]+" Pack");
        }
    }
    void choices(){
        System.out.println("Welcome to Mobile Recherge System");

    }
        
}

public class Switch {
    public static void main(String[] args){
    SelectPack obj = new SelectPack();
    obj.choices();  
    obj.display();
    }    
}
