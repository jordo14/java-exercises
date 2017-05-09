package org.launchcode.java.demos.java4python.methods;

/**
 * Created by jordanwills on 5/8/17.
 */
//import java.util.Scanner;

public class Max {
    public static int arrayMax(int[] array) {
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] test = {5, 3, 7, -2, 199, 75, 6};
        int answer = Max.arrayMax(test);
        System.out.println(answer);
    }
}
