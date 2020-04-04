import java.util.*;

// This is Benjamin's code, I asked if I could copy it, only for educational purposes.
// @Benjamin Proulx

public class EmailVerification{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String email;
        boolean hasAt = false;
        boolean hasDot = false;
        boolean isEmail = false;

        System.out.println("Enter email to verify its validity:");
        email = sc.nextLine();

        for(int i = 0; i < email.length(); i++){

            System.out.println(email.charAt(i));
            if(email.charAt(i) == '@' && hasDot == false){
                hasAt = true;
                System.out.println("has @");
            }
            if(email.charAt(i) == '.' && hasAt == true){
                hasDot = true;
                System.out.println("has .");
            }
            if(hasAt == true && hasDot == true){
                isEmail = true;
            } else {
                isEmail = false;
            }
        }
        
        if(isEmail == true){
            System.out.println("The email " + email + " is valid");
        } else {
            System.out.println("The email " + email + " is not valid");
        }
    }
}