package Ex4;

/* Calculation for adding and multiplying fractions.
* Simple program that computes the value of two fractions that are added or multiplied together,
* giving the final answer in terms of a fraction.
*
* @author Abdikhaliq Timer
* @version 2016-10-06
*/

public class Exercise4 { //Name of class following code convention.
/* The initial method only descibes the addition of the fractions, splitting the methods makes the code cleaner.
   The method splits the fraction that is being added into the two sections that are needed; the numerator and denominator.*/
  public static String addingFractions(int es, int ds, int ep, int dp) { 
    /* This method will output a type String as we want the final answer to be in the format of a fraction.*/
    int numerator = (es * dp) + (ep * ds);
    int denominator = (ds * dp);
    /* Placeholders will be used in order to pull the correct variables into the String. This will allow me the program
       to represent the correct fractions.*/
    String s = String.format("%d / %d", numerator, denominator);
    return s;
  }
public static String multiplyingFractions(int es, int ds, int ep, int dp) {
    int numerator = (es * ep);
    int denominator = (ds * dp);
    String s = String.format("%d / %d", numerator, denominator);
    return s;
  }
  public static void main(String[] args) { //Main method seperated in order to allow it to print the final outputs that we need.
    System.out.println(addingFractions(1,2,1,3)); //Seperating the other methods allows for easy adjustments in the future.
    System.out.println(addingFractions(1,3,3,4));
    System.out.println(multiplyingFractions(1,2,2,3));
    System.out.println(multiplyingFractions(1,4,2,3));
  }
}
