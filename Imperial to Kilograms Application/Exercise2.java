package Ex2;

/** This java program converts masses given in the imperial system, into kilograms.
*   The program could either have put everythin into one method, the main method, and called the different
*   weights as a placeholder, such as "1 pound is %f kg %n", however, I did not do it that was as it would not
*   allow for easy change of the measurements for future use. For example, if you wanted to find how much 
*   2 tons were in kg, my program will now allow for that.
*   @author Abdikhaliq Timer
*   @2016-10-06
*/
public class Exercise2 {
	/* I decided to split the different conversions into different methods in order to provide the user
	   a way to get the conversion right depending on the inputed information, so you could find the imperical weight
	   of a mass even if it is not equal to one.*/
	public static String kilo2Pound(double p) { //I gave each method an easy identifiable name
		double kilo2Pound = p * 0.45359237;
		String s1 = String.format("%f", kilo2Pound);
        return s1;
	}
	/* I decided to convert the values into strings in order to allow for rounding up using 
	   for example %.2f, however the question does not ask for a specific weight so I leave it
	   as it is, but my code will allow for easier rounding for the future*/
	public static String grain2Pound(double g) {
		double grain2Pound = g * (0.45359237 / 7000) ;
		String s2 = String.format("%f", grain2Pound);
        return s2;
	}
	public static String drachm2Pound(double d) {
		double drachm2Pound = d * (0.45359237 / 256);
		String s3 = String.format("%f", drachm2Pound);
        return s3;
	}
	public static String ounce2Pound(double o) {
		double ounce2Pound = o * (0.45359237 / 16);
		String s4 = String.format("%f", ounce2Pound);
        return s4;
	}
	public static String stone2Pound(double s) {
		double stone2Pound = s * (0.45359237 * 14);
		String s5 = String.format("%f", stone2Pound);
        return s5;
	}
	public static String quarter2Pound(double q) {
		double quarter2Pound = q * (0.45359237 * 28);
		String s6 = String.format("%f", quarter2Pound);
        return s6;
	}
	public static String hweight2Pound(double h) {
		double hweight2Pound = h * (0.45359237 * 112);
		String s7 = String.format("%f", hweight2Pound);
        return s7;
	}
	public static String ton2Pound (double t) {
		double ton2Pound = t * (0.45359237 * 2240);
		String s8 = String.format("%f", ton2Pound);
        return s8;
	}

  public static void main(String[] args) {
    System.out.println(kilo2Pound(1));    // simple code to alllow the user to change an imperial mass into kg.
    System.out.println(grain2Pound(1));   // I could have included text before the final answer in the form of:
    System.out.println(drachm2Pound(1));  // System.out.print(""); as tht would print before the answer
    System.out.println(ounce2Pound(1));   // but as it was not asked for, I did not include it
    System.out.println(stone2Pound(1));
    System.out.println(quarter2Pound(1));
    System.out.println(hweight2Pound(1));
    System.out.println(ton2Pound(1));
  }
}
