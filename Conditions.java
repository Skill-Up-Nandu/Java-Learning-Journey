import java.util.*;

class Checking{
    Scanner sc = new Scanner(System.in);

    int age(){
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        return age;
    }

    void check_voting_age(int age){
        if(age >= 18){
            System.out.println("Go Ahead ! , You can vote.");
        }
        else{
            System.out.println("Stop! , You are not an adult.");
        }
    }

    String check_category(int age){
        String status;
        if(age >= 0 && age <= 12){
            status = "kid";
            System.out.println("You are a kid.");
            return status;
        }
        else if(age >= 13 && age <= 19){
            status = "Teenager";
            System.out.println("You are a Teenager.");
            return status;
        } 
        else if(age >= 20 && age <= 60){
            status = "Adult";
            System.out.println("You are an Adult.");
            return status;
        }
        else{
            status = "Senior";
            System.out.println("You are a Senior citizen.");
            return status;
        }
    }

    void check_gender(String status, int age){
        if(age >=20 && age <=60){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Gender : ");
            String gender = sc.nextLine();
            if(gender.equalsIgnoreCase("male")){
                System.out.println("You comes under Male Category");
            }
            else if(gender.equalsIgnoreCase("female") ){
                System.out.println("You comes under Female Category");
            }
            else{
                System.out.println("You comes under Others Category");
            }
        }
        else{
            System.out.println("You can go for General category.");
        }
    }
}

public class Conditions{
    public static void main(String[] args){
        System.out.println("This is an EVM.");

        // creating object for class "Checking"
    Checking obj = new Checking();
    int age = obj.age();
    obj.check_voting_age(age);
    String status = obj.check_category(age);
    obj.check_gender(status, age);

       
    }
}