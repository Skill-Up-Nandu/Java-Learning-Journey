// Input a string from the user. Create a new string called 'result' in which you will replace one  letter with another letter.


import java.util.*;

class Logic{

    String str;
    String newStr = "";

    Logic(String s){
        str = s;
        System.out.println("Current Word : "+str);
    }

    String replace(){

        // i with x
        for(int i=0; i<str.length(); i++){
            
            if(str.charAt(i) == 'i'){
                newStr += "x";
            }else{
                newStr += str.charAt(i);
            }
        }
        System.out.println("New Word : "+ newStr);
        return newStr;
    }
}

public class ReplaceString{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Word : ");
        String str = sc.next();

        Logic obj = new Logic(str);
        String newStr = obj.replace();
    }
}