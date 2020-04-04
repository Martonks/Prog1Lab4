import java.util.*;

// This program validates your email using a loop to find the @ sign and a period.
// @Martin Calero


public class ValidEmail{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your email to validate it");
        
        boolean hasDot = false;
        boolean hasAt = false;
        boolean isEmail = false;
        String email = sc.nextLine();

        for (int i=0; i<email.length(); i++){
            if(!hasAt) {
                if (email.charAt(i)=='@'){
                    hasAt=true;
                } else if (email.endsWith("@") || email.endsWith("@")){
                    isEmail=false;
                }
            } else if (!hasDot){
                if (email.charAt(i)=='.'){
                    hasDot=true;
                } else if (email.endsWith(".") || email.startsWith(".")){}
                    isEmail=false;
            }
        }

        if (hasAt == true || hasDot == true) {
            isEmail=true;
            System.out.println("Valid Email");
        } else {
            isEmail=false;
            System.out.println("Invalid Email");
        }
    
    }
}