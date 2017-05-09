package org.launchcode.java.demos.java4python;

/**
 * Created by jordanwills on 5/8/17.
 */
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // write your code here
        String userInput;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        userInput = in.next();

        System.out.println("Hello " + userInput);
    }
}
