import java.util.Scanner;
 
public class NumberGuessingGame {
      public static void main(String[] args) {
            int secretNumber;
            secretNumber = (int) (Math.random() * 9999 + 1);
            Scanner keyboard = new Scanner(System.in);
            int guess;
            int upper = 10000; 
        	int lower = 1;
           int numGuesses = 1;
        	do {
              
            	System.out.print("Enter a guess " + (lower) + "-" + (upper) + ":" );
                  guess = keyboard.nextInt();
                 numGuesses++;
                  if (guess == secretNumber)
                        
                	  System.out.println("Your guess is correct. It took you " + numGuesses + "guesses");
                   else if (guess < secretNumber) {
                    
                    	lower = guess;
                     System.out.println("Your guess is smaller then the number."); }
                  else if (guess > secretNumber) {
                   
                	  upper = guess;
                	  
                			  System.out.println("Your guess is greater than the number."); }
            } while (guess != secretNumber);
      }
}