import java.util.*;

// This program puts together 10 different grades of an exam and calculates the average, aswell as printing out the minimum and maximum.
// @Martin Calero

public class Question61{

    public static void main(String[] args) {
        //Declarations
        int numberOfGrades = 10;
        double grade, totalGrades = 0, average;
        double min = 100;
        double max = 0;
                
                for(int i = 1; i <= numberOfGrades; i++)
                {
                    Scanner keyboard = new Scanner(System.in);
                    System.out.println("\nEnter grade " + i + " >");
                    grade = keyboard.nextDouble();
                   
                    if (grade>100 || grade<0) {
                        System.out.println("Please enter a new grade");
                        i--;    
                    } else {
                        totalGrades = totalGrades + grade;

                        if (grade<min){
                            min=grade;
                        }
                        if (grade>max){
                            max=grade;
                        }
                           
                    }
                  
                }
                average = totalGrades / numberOfGrades;
               
        Scanner input = new Scanner(System.in);
       
        System.out.println("The average grade is " +average);
        System.out.println("The minimum grade is " +min);
        System.out.println("The maximum grade is " +max);
    }
   
}
 
 