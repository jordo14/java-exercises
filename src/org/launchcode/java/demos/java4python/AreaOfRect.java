package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * Created by jordanwills on 5/8/17.
 */
public class AreaOfRect {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a length: ");
        length = in.nextDouble();
        System.out.println("Enter a width: ");
        width = in.nextDouble();

        area = length * width;
        System.out.println("The area of a Rectangle with length " + length + " and width " + width + " equals " + area);
    }
}
