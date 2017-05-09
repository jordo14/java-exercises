package org.launchcode.java.studios;

/**
 * Created by jordanwills on 5/8/17.
 */
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        float miles;
        float gallons;
        float milesPerGallon;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter how many miles you went: ");
        miles = in.nextInt();
        System.out.println("Enter how much gas you used: ");
        gallons = in.nextInt();

        milesPerGallon = miles/gallons;
        System.out.println("Your miles per gallon is " + milesPerGallon);

    }
}
