
// This program sums up the integers between 10 and 20 inclusive
// @Martin Calero

public class Question46 {

    public static void main(String[] args) {

        int num = 20;
        int sum = 0;
        
        for(int i = 10; i <= num; ++i)
        {
            sum += i;
        }

        System.out.println("The sum of all integers between 10 and 20 inclusive equals to " + sum);
    }
}