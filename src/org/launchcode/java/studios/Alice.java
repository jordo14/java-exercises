package org.launchcode.java.studios;

/**
 * Created by jordanwills on 5/8/17.
 */
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String wonder = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        String userInput;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        userInput = in.next();

        if(wonder.toLowerCase().indexOf(userInput.toLowerCase()) != -1) {
            System.out.println("Yep that word exists!");
        } else {
            System.out.println("That does not exist");
        }

    }
}
