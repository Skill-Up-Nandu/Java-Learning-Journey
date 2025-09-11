// Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'. Display that username to the user.

import java.util.*;

class Logic{

    String email;
    String username = "";
    Logic(String e){
        email = e;
    }

   String getUsername(){
        
        for(int i=0; i<email.length(); i++){

            if(email.charAt(i) == '@'){
                break;
            }else{
                username += email.charAt(i) ;
            }
        }
        System.out.println("Username : "+ username);
        return username;
    }
}

public class SubString{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Email : ");
        String email = sc.next();
        // creating object
        Logic obj = new Logic(email);
        String username = obj.getUsername();
    }
}