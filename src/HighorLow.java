import java.util.Random;
import java.util.Scanner;

public class HighorLow
{

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       Random rnd = new Random();

       boolean done = false;

       int numToGuess = rnd.nextInt(10) + 1; // 0-9 + 1 -> 1-10
       int guess = 0;
       
       String trash = "";

       do {
           System.out.print("Try to guess my number (1-10) in one try: ");
           if (in.hasNextInt()) {
               guess = in.nextInt();
               in.nextLine();
               if (guess >= 1 && guess <= 10)
                   done = true;
               else
                   System.out.println("Must be between 1 - 10 inclusive! Not: " + guess);
           } else {
               trash = in.nextLine();
               System.out.println("You must enter a number not: " + trash);
           }
       }while(!done);

        if(guess == numToGuess)
        {
            System.out.println("Excellent you guessed my number: " + numToGuess);
        }
        else if(guess < numToGuess)
        {
           System.out.println("NO. That is lower than my number: " + numToGuess);
        }
        else
        {
           System.out.println("NO. That is higher than my number: " + numToGuess);
        }

            

       
    }
    
}
