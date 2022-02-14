import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        double meters;
        double miles;
        double feet;
        double inches;
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter a length in meters: ");
        meters = userIn.nextDouble();

        miles = meters/1609.344;
        feet = miles*5280;
        inches = feet*12;

        System.out.println("The amount of meters you entered is " + meters + ".");
        System.out.println("The conversion to miles is " + miles + ".");
        System.out.println("The conversion from miles to feet is " + feet + ".");
        System.out.println("The conversion from feet to inches is " + inches + ".");
    }
}
