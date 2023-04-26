package edu.guilford;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Numbers {
    public static void main(String[] args) {

        // 4 Create a driver program that tests your constructor and toString method.
        // You now have a minimal testable program. Test it and, if necessary, debug it.
        // Did this, it works.

        //Create a random rational number. 
        Rational randomRational = new Rational(); // Random rational number
        Scanner scan = new Scanner(System.in); 
        System.out.println("Let us create a rational number and do things with it!");
        System.out.println("Enter a numerator: ");
        int numerator = scan.nextInt();
        System.out.println("Enter a denominator (CANNOT BE 0): ");
        int denominator = scan.nextInt();
        Rational userRational = new Rational(numerator, denominator);

        //Show the user their rational number. 
        System.out.println("Here is our created rational object: " + userRational.toString() + "\n");

        // Prompt the user to enter the numerator and denominator of their expected arithmetic result
        // of the their own or two rational numbers
        // in the follow format: x/y.

        //For negation.
        System.out.println("Enter your expected numerator if your rational number was negated: ");
        int expectedNNumerator = scan.nextInt();
        System.out.println("Enter your expected denominator if your rational number was negated: ");
        int expectedNDenominator = scan.nextInt();
        userRational.negate(expectedNNumerator, expectedNDenominator);

        //For inversion.
        System.out.println("Enter your expected numerator if your rational number was inverted: ");
        int expectedINumerator = scan.nextInt();
        System.out.println("Enter your expected denominator if your rational number was inverted: ");
        int expectedIDenominator = scan.nextInt();
        userRational.invert(expectedINumerator, expectedIDenominator);

        //For double.
        System.out.println("Enter your expected number if you converted your rational number to a double:");
        double expectedDouble = scan.nextDouble();
        System.out.println(userRational.toDouble(expectedDouble) + "\n");

        //For addition. 
        System.out.println("Let us now add your rational number to a random rational number"); 
        System.out.println("Input 1: " + userRational.toString() + "\n" + "Input 2 (random rational number): " + randomRational.toString());
        System.out.println("Enter your expected numerator if your rational number was added to a random rational number"
        + "(in this case, that is " + randomRational.toString() + " )");
        int expectedANumerator = scan.nextInt();
        System.out.println("Enter your expected denominator if your rational number was added to a random rational number"
        + "(in this case, that is " + randomRational.toString() + " )");
        int expectedADenominator = scan.nextInt();
        System.out.println("TLDR Sum (if denominator is not 0): " + randomRational.add(userRational, expectedANumerator, expectedADenominator) + "\n"); 
        

    }
}
