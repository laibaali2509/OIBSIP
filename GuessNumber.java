

package guesscorrectnumber;
import java.util.*;

public class GuessNumber
{
    public static void main(String[] args)
    {
        System.out.println("\n **********Welcome to Number Guessing Game***********");
         Scanner sc = new Scanner(System.in);
        String play = "yes";
        
      //while loop if we want to play the game again and again
        while(play.equals("yes"))
        {
            
        Random rn = new Random();
        int randNum = rn.nextInt(100);
        
        int guess = -1;
        int tries =0;
        
         // while loop to check if the game is over
        while(guess != randNum)
        {
            System.out.println("\n Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            tries++;
           
            if(guess == randNum)
            {
                System.out.println("\n Awesome! You guessed the correct number!");
                System.out.println("\n It only took you " + tries + " guesses!");
                System.out.println("\n Would you like to play again? Yes or No: ");
                play = sc.next().toLowerCase();
            }
            else if(guess > randNum)
            {
                System.out.println("\n your guess is too high, try again.");
            }
            else
            {
                System.out.println("\n your guess is too low, try again.");
            }
            
        }
        
       }
        
        sc.close();
    }
    
}
