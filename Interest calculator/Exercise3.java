package Ex3;

/** Working out the balance after a certain time period, considering rate of interest.
* As the calculation included incremental calculations, I wanted to write an easy code that considers 
* all the calculation at ones, instead of printing out the individual years needed in a certain time scale. 
* reference "http://www.javacodex.com/Math-Examples/Calculating-Compound-Interest"
*
* @author Abdikhaliq Timer
* @version 2016-10-06
*/
public class Exercise3 { //Following the code convention, I named the class the Exercise for easy future finding.
  public static void main(String[] args) { 
    int years = 5; //int is used as years will always be a whole number, in this case.
    double interest = 2.3; //names given to the variables represent what they do, for ease of future use.
    int capital = 100;
    double earnings = capital * Math.pow(1 + 0.01 * interest, 500);

    System.out.println("Your balance over " + years + " years is:   "); 
    /* A loop is used here, as it makes the code better. Instead of having endless System.out.print function, 
       this allows for easy printing.*/
    for(int x = 1; x <= years; x++) { 
        /* x++ means add one to x each time, as long as it is <= less than or equal to our x,
           which in our case is 5, will hence print years 1, 2, 3, 4 and 5. */
        double total = capital * Math.pow(1 + 0.01 * interest, x); 
        /* Math.pow raises the first element within the bracket to the element in the second hadlf, eg Math.pow(a,b) = a^b.*/
        System.out.printf("Year " + x + ":\u00a3%.2f\n", total);
        /* The \u00a3 represents the pound sign, and the .2f formats it so that our final double is rounded to two decimal places, 
           as this is in terms of money.*/
        }
    System.out.printf("Your balance in the 500th year will be: \u00a3%.2f.\n", earnings); //single line to print the 500th year required.
    }
}
