import java.util.*;

// This program does the product of integers between 3 and 7 inclusive
// @Martin Calero

public class Question47 {

    public static void main(String[] args) {

        int num = 7;
        int product = 1;
        
        for(int i = 3; i <= num; ++i)
        {
            product *= i;
        }

        System.out.println("The product of the integers between 3 to 7, inclusive is equal to " + product);
    }
}