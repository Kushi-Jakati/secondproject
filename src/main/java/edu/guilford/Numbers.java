package edu.guilford;

/**
 * Hello world!
 *
 */
public class Numbers 
{
    public static void main( String[] args )
    {

        //Rational rational = new Rational();
        //System.out.println(rational.toString());
        Rational rational2 = new Rational(2, 4);
        System.out.println("Here is the og object: " + rational2.toString() + "\n");
        //rational.invert();
        rational2.negate();
        System.out.println("Here is the numerator sign flipped :" + rational2.getNumerator()); 
        System.out.println("Here is the double for the rational number: " + rational2.toDouble() + "\n");
        System.out.println("Here is the new rational object: " + rational2.toString());

    }
}
