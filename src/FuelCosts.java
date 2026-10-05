import java.util.Scanner;

public class FuelCosts{

    public static void main(String[] args) {
        double tank = 0, mpg = 0, price = 0, cost100 = 0, dist = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        // Use these for the input loops
        boolean doneTankInGallons = false;
        boolean doneMPG = false;
        boolean donePricePerGallon = false;

        do
        {
            System.out.print("Enter tank capacity in gallons: ");

            if (in.hasNextDouble()) {
                tank = in.nextDouble();
                in.nextLine(); // clear the buffer
                doneTankInGallons = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid value.");
                System.out.println("Try again!");
            }

        } while (!doneTankInGallons);

        do
        {
            System.out.print("Enter fuel efficiency in Miles Per gallons: ");

            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // clear the buffer
                doneMPG = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid value.");
                System.out.println("Try again !");
            }

        } while (!doneMPG);

        do
        {
            System.out.print("Enter price of gas per gallon:  ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine(); // clear the buffer
                donePricePerGallon = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid value.");
                System.out.println("Try again!");
            }

        } while (!donePricePerGallon);

        // OK done with the input now we calculate and then display the results
        cost100 = 100 / mpg * price;

        System.out.printf("The price of gas to travel 100 miles is: $%6.2f\n", cost100);

        dist = tank * mpg;

        System.out.printf("The distance able to be traveled with a full gas tank is %6.2f miles.\n", dist);
    }
}
