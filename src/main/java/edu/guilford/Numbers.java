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

        // Rational rational = new Rational();
        // System.out.println(rational.toString());
        Rational randomRational = new Rational(); // Random rational number
        Scanner scan = new Scanner(System.in); 
        System.out.println("Let us create a rational number and do things with it!");
        System.out.println("Enter a numerator: ");
        int numerator = scan.nextInt();
        System.out.println("Enter a denominator (CANNOT BE 0): ");
        int denominator = scan.nextInt();
        Rational userRational = new Rational(numerator, denominator);


        System.out.println("Here is our created rational object: " + userRational.toString() + "\n");
        userRational.negate();
        userRational.invert();
        System.out.println(userRational.toDouble() + "\n");
        System.out.println("TLDR Sum (if denominator is not 0): " + randomRational.add(userRational)); 
        

    }
}
