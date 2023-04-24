package edu.guilford;

// Define a class called Rational.
public class Rational {
    // A Rational object should have two integer attributes that store the numerator
    // and denominator.
    private int numerator;
    private int denominator;

    // Add a constructor that takes no arguments and sets the numerator to 0 and
    // denominator to 1.
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    // Add a toString method that displays a Rational object in a reasonable format.
    @Override
    public String toString() {
        return "Rational Information.\n" +
                "Numerator: " + numerator + "\n" + "Denominator: " + denominator;
    }
    
    //Getters and Setters
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
    
    
    // 4 Create a driver program that tests your constructor and toString method.
    // You now have a minimal testable program. Test it and, if necessary, debug it.
    // Did this, it works.

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
    }

    // Write a method called negate that reverses the sign of the rational number.
    // This method simply modifies the existing attributes, so add a comment to
    // explain why its return type should be void. Add lines to main to test the new
    // method.
    public void negate() {
        numerator = -numerator;
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

    // Challenge Write an instance method named reduce that reduces a rational
    // number to its lowest terms by finding the greatest common divisor (GCD) of
    // the numerator and denominator and dividing through. This method should be a
    // pure method; it should not modify the instance variables of the object on
    // which it is invoked. Hint: Finding the GCD takes only a few lines of code.
    // Search the web for “Euclidean algorithm”.

    // Write a method called add that takes a Rational number as an argument, adds
    // it to the rational number represented by the current object, and returns a
    // new Rational object. There are several ways to add fractions. You can use any
    // one you want.

    // If you did the challenge exercise, you should also make sure
    // that the result of the operation is reduced so that the numerator and
    // denominator have no common divisor (other than 1).

    // Modify the constructor that takes no arguments so that it generates a
    // Rational number with random values for the numerator and denominator in the
    // range [–100, 100]. If there is an attempt to generate a Rational number with
    // a denominator of 0, then the constructor should select a new random number.
    // (Note: This last step requires a while loop or similar construct.)

}
