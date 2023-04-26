package edu.guilford;

import java.util.Random;
import java.util.Scanner;

// Define a class called Rational.
public class Rational { 
    // A Rational object should have two integer attributes that store the numerator
    // and denominator.
    private int numerator;
    private int denominator;
    Scanner scan = new Scanner(System.in);

    //Method to be invoked in constructors to ensure that syntax of rational number (with regard to signs)
    //is correct.
    private void ensuringSigns() {
        // For syntax and algorithmetic purposes..
        // If numerator and denominator are both negative, then make them both positive.
        // If else, if numerator is positive and denominator is negative, then make them
        // both negative. Else, do nothing.
        if (denominator == 0) {
            System.out.println("Your denominator cannot be 0. Please try again with a denominator that is not 0.");
        } else if (numerator < 0 && denominator < 0) {  
            // else if numerator and denominator are both negative, 
            //then make them both positive.
            numerator = -numerator;
            denominator = -denominator;
        } else if (numerator > 0 && denominator < 0) {
            // else if numerator is positive and denominator is negative, then make them
            // both negative. 
            numerator = -numerator;
            denominator = -denominator;
        }
    }
    
    // Constructor that generatesnRational number with random values for the numerator and denominator in the
    // range [–100, 100]. CHECK THIS. CHECK THIS. CHECK THIS.
    public Rational() {
        Random random = new Random();
        // Random integer between -100 and 100
        numerator = random.nextInt(201) - 100;
        denominator = random.nextInt(201) - 100;
        // If there is an attempt to generate a Rational number with
        // a denominator of 0, then the constructor should select a new random number.
        while (denominator == 0) {
            // Random integer between -100 and 100
            denominator = random.nextInt(201) - 100;
        }
        ensuringSigns(); 
    }

    // Write a second constructor that takes two arguments and uses them to
    // initialize the attributes.
    // Rational numbers should not have denominators equal to zero. Add code that
    // prints out a warning if the constructor with parameter attempts to generate a
    // Rational number with a 0 denominator.
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        ensuringSigns(); 
    }

    // Add a toString method that displays a Rational object in a reasonable format.
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Getters and Setters
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Write a method called negate that reverses the sign of the rational number.
    // This method simply modifies the existing attributes, so add a comment to
    // explain why its return type should be void. Add lines to main to test the new
    // method.
    public void negate() {
        if (denominator == 0) {
            System.out.println("Your denominator cannot be 0 if we need to negate. Please try again with a denominator that is not 0.");
        } else if (denominator != 0) {
            System.out.println("Negating the rational number " + toString() + "...");
            // Prompt the user to enter the numerator and denominator of their expected sum
            // of the two rational numbers
            // in the follow format: x/y.
            System.out.println("Please enter your expected numerator for negation: ");
            // Store the user's input in an int variable
            int expectedNumerator = scan.nextInt();
            System.out.println("Please enter your expected denominator for negation: ");
            // Store the user's input in an int variable
            int expectedDenominator = scan.nextInt();
            String expectedNegate = expectedNumerator + "/" + expectedDenominator;
            System.out.println("Expected Negated Rational Number: " + expectedNegate);
            numerator = -numerator;
            System.out.println("Negated Rational Number calculated from the system: " + toString() + "\n");
        }
        // Return type should be void because it is only modifying our current
        // attribute;
        // If we were, on the offhand, to return a new variable that represents the numerator with its
        // sign reversed, that would not be directly modifying our
        // current attribute. However, if we were just to return our
        // numerator, that would be just redundant and not necessary as we just want to
        // modify our attribute--not have the method output back anything to us.
    }

    // Write a method called invert that swaps the numerator and denominator. Add
    // lines to main to test the new method.
    public void invert() {
        if (denominator == 0) {
            System.out.println("Your denominator cannot be 0 if we need to invert. Please try again with a denominator that is not 0.");
        } else if (denominator != 0) {
            System.out.println("Inverting the rational number " + toString() + "...");
            System.out.println("Input: " + toString());
            // Prompt the user to enter the numerator and denominator of their expected sum
            // of the two rational numbers
            // in the follow format: x/y.
            System.out.println("Please enter your expected numerator: ");
            // Store the user's input in an int variable
            int expectedNumerator = scan.nextInt();
            System.out.println("Please enter your expected denominator: ");
            // Store the user's input in an int variable
            int expectedDenominator = scan.nextInt();
            if (expectedNumerator > 0 && expectedDenominator < 0) {
                expectedNumerator = -expectedNumerator;
                expectedDenominator = -expectedDenominator;
            }
            String expectedInvert = expectedNumerator + "/" + expectedDenominator;
            System.out.println("Expected Invert: " + expectedInvert);
            int invertPlaceholder = numerator;
            numerator = denominator;
            denominator = invertPlaceholder;
            ensuringSigns();
            System.out.println("Invert calculated from the system: " + toString() + "\n");
        }
    }

    // Write an instance method called toDouble that converts the rational number to
    // a double (floating-point number) and returns the result. This method does not
    // modify the object. As always, test the new method.
    public double toDouble() {
        double expectedDouble; 
        double doubleRationalNumber = 0.0;
        if (denominator ==0) {
            System.out.println("Your denominator cannot be 0 if we need to find the double. Please try again with a denominator that is not 0.");
        }else if (denominator !=0) {
            System.out.println("Converting the rational number " + toString() + " to a double...");
            System.out.println("Input: " + toString());
            // Prompt the user to enter their expected double. 
            System.out.println("Please enter your expected double: ");
            // Store the user's input in an double variable
            expectedDouble = scan.nextDouble();
            System.out.println("Expected Double: " + expectedDouble);
            doubleRationalNumber = (double) numerator / denominator;
            System.out.println("Double calculated from the system: ");
        }
        return doubleRationalNumber;
    }

    // Add method: adding two rational numbers together. 
    public Rational add(Rational rational) {
        if (denominator == 0 || rational.denominator == 0) {
            System.out.println("Your denominator cannot be 0 if we need to find the sum. Please try again with a denominator that is not 0.");
        } else {
            System.out.println("Calculating the sum of rational numbers (your rational number and a randomly generated one)...");
            System.out.println("Input 1: " + rational.toString() + "\n" + "Input 2 (random): " + toString());
            // Prompt the user to enter the numerator and denominator of their expected sum
            // of the two rational numbers
            // in the follow format: x/y.
            System.out.println("Please enter your expected numerator: ");
            // Store the user's input in an int variable
            int expectedNumerator = scan.nextInt();
            System.out.println("Please enter your expected denominator: ");
            // Store the user's input in an int variable
            int expectedDenominator = scan.nextInt();
            // System.out.println("Please enter your expected sum of the two rational
            // numbers in the following format: x/y.");
            // //Store the user's input in a string variable
            String expectedSum = expectedNumerator + "/" + expectedDenominator;
            System.out.println("Expected Sum: " + expectedSum);

            // Create a new rational object that represents the sum of the two rational
            // numbers
            int newNumerator = (numerator * rational.getDenominator()) + (denominator * rational.getNumerator());
            int newDenominator = denominator * rational.getDenominator();
            Rational newRational = new Rational(newNumerator, newDenominator);
            System.out.println("The sum of " + toString() + " and " + rational.toString() + " from our program is "
                    + newRational.toString() + ".");
                    return newRational;
        }
        return rational;
    }

     // Challenge Write an instance method named reduce that reduces a rational
        // number to its lowest terms by finding the greatest common divisor (GCD) of
        // the numerator and denominator and dividing through. This method should be a
        // pure method; it should not modify the instance variables of the object on
        // which it is invoked. Hint: Finding the GCD takes only a few lines of code.
        // Search the web for “Euclidean algorithm”.
        // If you did the challenge exercise, you should also make sure
        // that in the add method, the result of the operation is reduced so that the
        // numerator and
        // denominator have no common divisor (other than 1).

        // public int greatestCD() {
        //     int absoluteNumerator = Math.abs(numerator);
        //     int absoluteDenominator = Math.abs(denominator);

            

            

        // }

    }