/*
 * Program: GetSetBaggers.java
 * Student: Lydia Frame 
 * Purpose: create a program that illustrate the use of public and private access modifiers and illustrates Encapsulation. 
 * This Program will create a bagger class. 
 * You will impute the bagger name, bagger start time, is bagger a minor, bagger break time. Using military time.
*/

import java.util.Scanner; // Import the Scanner class

public class GetSetBaggers {
		
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
		Scanner input = new Scanner(System.in);

        Bagger bagger1 = new Bagger("Lydia", false, 8, 12);
        System.out.println("Bagger name: " + bagger1.getName());
        System.out.println("Is bagger a minor: " + bagger1.getIsMinor());
        System.out.println("Bagger start time: " + bagger1.getStartTime());
        System.out.println("Bagger break time: " + bagger1.getBreakTime());

        System.out.println();

        Bagger bagger2 = new Bagger("Alisha", true, 8, 12);
        System.out.println("Bagger name: " + bagger2.getName());
        System.out.println("Is bagger a minor: " + bagger2.getIsMinor());
        System.out.println("Bagger start time: " + bagger2.getStartTime());
        System.out.println("Bagger break time: " + bagger2.getBreakTime());

        System.out.println();

        System.out.println("Total number of baggers: " + Bagger.totalBaggers);
        
        // Close the scanner to prevent resource leaks
        input.close();
    }
}