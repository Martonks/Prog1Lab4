import java.util.*;

public class Palindrome {

    public static void main(String[] args){

        String initial;
        String palindrome;
        String fin;
        int counter;
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;

        System.out.println("Please enter a word/sentence to verify if it is a palindrome: ");
        initial = sc.nextLine();

        palindrome = initial;
        palindrome = palindrome.replaceAll("[^\\p{IsDigit}\\p{IsAlphabetic})]","").toLowerCase();

        fin = new StringBuilder(palindrome).reverse().toString();
        counter = palindrome.length();
        counter--;

        do{
            if(palindrome.charAt(counter) == fin.charAt(counter)){
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
            counter--;
        }
        while (counter >= 0 && isPalindrome == true);

        if(isPalindrome == true){
            System.out.println("The word "+initial+" is a palindrome");
        } else {
            System.out.println("The word "+initial+" is not a palindrome");
        }
    }
}