import java.util.Scanner;

public class RectangleInfo 
{

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);

       boolean doneA = false;
       boolean doneB = false;

       double sideA = 0;
       double sideB =0;
       double sideC = 0;

       double area = 0;
       double perimeter = 0;
       String trash = "";

       do {
           System.out.print("Enter length of side A: ");
           if (in.hasNextDouble()) {
               sideA = in.nextDouble();
               in.nextLine();  //clear the buffer
               doneA = true;
           } else {
               trash = in.nextLine();
               System.out.println(trash + " is not a valid value.");
           }
       }while(!doneA);

        do {
            System.out.print("Enter length of side B: ");
            if (in.hasNextDouble()) {
                sideB = in.nextDouble();
                in.nextLine();  //clear the buffer
                doneB = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid value.");
            }
        }while(!doneB);

        sideC = Math.sqrt(sideA * sideA + sideB * sideB);
        area = sideA * sideB;
        perimeter = sideA * 2 + sideB * 2;

        System.out.printf("The length of the hypotenuse is: %8.2f\n", sideC);
        System.out.printf("The area is %8.2f\n", area);
        System.out.printf("The perimeter is %8.2f\n", perimeter);

    }
   
}
