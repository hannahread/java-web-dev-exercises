package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        double miles;
        double gallons;
        double gasMileage;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        miles = input.nextDouble();
        System.out.println("How many gallons of gas have you used: ");
        gallons = input.nextDouble();

        gasMileage = (miles / gallons);
        System.out.println("Your gas mileage is: " + gasMileage);
    }
}
