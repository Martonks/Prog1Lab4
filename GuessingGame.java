import java.util.*;
import java.util.Random;

// This program lets you guess a random generated number between 1 and 100 with a set amount of tries. 
// Winning gives you the option to play again.
// @Martin Calero

public class GuessingGame{

    public static void main(String[]args){

        // Set variables
        Scanner sc = new Scanner(System.in);
        int guess;
        int numberGenerated;
        int numberofTries;
        boolean numberGuessed = false;
        boolean restart = true;
        Random number = new Random();
        char answer;

        // Create a do-while loop
        do {
            
           numberofTries = 10;
           numberGenerated = (int) (Math.random() * 100);
           System.out.println("Please guess a number between 1 and 100: ");
           
           // If you want to get the answer right away:
           // System.out.println(numberGenerated);

           // Set a while loop to setup the amount of attempts
           while(numberofTries > 0 && numberGuessed == false){
               System.out.println("Tries remaining: "+ numberofTries);
               guess = sc.nextInt();
            
               // If statement to pinpoint the accuracy of your answer
               if(guess > numberGenerated){
                System.out.println("Too high!");
                } else if(guess < numberGenerated){
                    System.out.println("Too low!");
                }

               // 2nd if statement to see if guess is right, if not remove an attempt
               if(guess == numberGenerated){
                numberGuessed = true;
               } else {
                   numberofTries--;
               }
               
               // 3rd if statement to restart the program
               if(numberGuessed == true){
                   System.out.println("Congratulations! You've won! Would you like to try again? Y/N");
                   answer = sc.next().toUpperCase().charAt(0);
                   if (answer == 'Y'){
                       restart = true;
                       numberGuessed = false;
                       numberGenerated = (int) (Math.random()*100);

                    // If you want to get the answer right away:
                    // System.out.println(numberGenerated);
                    
                   } else {
                       restart = false;
                       
                   }
               } 
           }
        } while(restart == true);

    }

}
