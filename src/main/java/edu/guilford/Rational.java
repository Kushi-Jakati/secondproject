package edu.guilford;

import java.util.Random;

// Define a class called Rational.
public class Rational {
    // A Rational object should have two integer attributes that store the numerator
    // and denominator.
    private int numerator;
    private int denominator;

    // Add a constructor that takes no arguments and sets the numerator to 0 and
    // denominator to 1.
    // Modify the constructor that takes no arguments so that it generates a
    // Rational number with random values for the numerator and denominator in the
    // range [–100, 100]. CHECK THIS. CHECK THIS. CHECK THIS.
    public Rational() {
        Random random = new Random();
        //Random integer between -100 and 100
        numerator = random.nextInt(201) - 100;
        // If there is an attempt to generate a Rational number with
        // a denominator of 0, then the constructor should select a new random number.
        while (denominator == 0) {
            //Random integer between -100 and 100
            denominator = random.nextInt(201) - 100;
        }

        //If numerator and denominator are both negative, then make them both positive. 
        //If else, if numerator is positive and denominator is negative, then make them both negative. Else, do nothing.
        if (numerator < 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        } else if (numerator > 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Write a second constructor that takes two arguments and uses them to
    // initialize the attributes.
    // Rational numbers should not have denominators equal to zero. Add code that
    // prints out a warning if the constructor with parameter attempts to generate a
    // Rational number with a 0 denominator.
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {
            System.out.println("Your denominator cannot be 0. Please try again with a denominator that is not 0.");
        }
        //If numerator and denominator are both negative, then make them both positive. 
        //If else, if numerator is positive and denominator is negative, then make them both negative. Else, do nothing.
        if (numerator < 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        } else if (numerator > 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        } 
    }

    // Add a toString method that displays a Rational object in a reasonable format.
    @Override
    public String toString() {
        return numerator + "/" + denominator;

                // return "Your Rational=.\n" +
                // "Numerator: " + numerator + "\n" + "Denominator: " + denominator + "\n" + 
                // "Your Fraction: " + numerator + "/" + denominator + "\n";
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
        numerator = -numerator;
        //Return type should be void because it is only modifying our current attribute; 
        //returning a new variable that represents the numerator with its
        //sign reversed would not be directly modifying our
        //current attribute. However, if we were just to return our
        //numerator, that would be just redundant and not necessary as we just want to 
        //modify our attribute--not have the method output back anything to us??
    }

    // Write a method called invert that swaps the numerator and denominator. Add
    // lines to main to test the new method.
    public void invert() {
        int invertPlaceholder = numerator;
        numerator = denominator;
        denominator = invertPlaceholder;
    }

    // Write an instance method called toDouble that converts the rational number to
    // a double (floating-point number) and returns the result. This method does not
    // modify the object. As always, test the new method.
    public double toDouble() {
        double doubleRationalNumber = (double) numerator / denominator;
        return doubleRationalNumber;
    }

    //There are several ways to add fractions. You can use any one you want.
    // So basically, you need to create a method called add. It should take a rational number as an argument 
    //and add it with the rational number that is already in the object. The return will be that new
    // rational number. 
// The driver program should test all aspects of the Rational class definition.
// The output should

// identify what aspect of the class is being tested
// give the input and the expected result
// show that the actual result matches the expected result
// For example, testing the addition of two Rational objects could result in
// output like

// Testing addition of rational numbers
// Input: 1/2 and 2/3; Expected output: 7/6
// Program output
// The sum of 1 / 2 and 2 / 3 is 7 / 6
// Note that the last line would use the toString method for all three Rational
// objects and the add method that you wrote for the class.

// If any of your tests fails, modify the class definition to fix the issue.
    public Rational add(Rational rational) { 
        System.out.println("Calculating the sum..."); 
        System.out.println("Input 1: " + rational.toString() + "\n" + "Input 2: " + toString());
        //What is expected output?????? WHAT IS EXPECTED OUTPUT??????????
        int newNumerator = (numerator * rational.getDenominator()) + (denominator * rational.getNumerator());
        int newDenominator = denominator * rational.getDenominator();
        Rational newRational = new Rational(newNumerator, newDenominator);
        //System.out.println("Here is the expected sum output of the two rational numbers: " + newRational.toString());
        System.out.println("The expected sum of " + toString() + " and " + rational.toString() + " is " + newRational.toString() + "."); 
        return newRational;
    }


}
