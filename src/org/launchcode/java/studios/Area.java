package org.launchcode.java.studios;

/**
 * Created by jordanwills on 5/8/17.
 */
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = in.nextDouble();

        area = 3.14 * radius * radius;
        System.out.println("The area of a circle of " + radius + " is " + area);
    }
}
