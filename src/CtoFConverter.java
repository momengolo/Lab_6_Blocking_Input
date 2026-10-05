import java.util.Scanner;

public class CtoFConverter
{

    public static void main(String[] args) 
    {
        double celsius = 0;
        double farenheit = 0;
        boolean done = false; // You are not done when you start!
        String trash = "";
        
        Scanner in = new Scanner(System.in);

        // Input loop for bullet proofing
        do
        {

            //prompt user for C value
            System.out.print("Enter Celsius value: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine(); // clear the buffer

                farenheit = 9.0 / 5 * celsius + 32;
                System.out.println("\nFarenheit value for " + celsius + " is " + farenheit);
                done = true;
            }
            else
            {
               trash = in.nextLine();
               System.out.println("You must enter a valid number not: " + trash);
               System.out.println("Try again!");
            }

        }while(!done);

    }
    
}
