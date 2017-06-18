package Ex1;

/** Computation of the Area of a circle. 
*   
*   @author Abdikhaliq Timer
*   @2016-10-06
*/
public class Exercise1 { //Gave the class a name following the java doc, starting it with a Capital.
  /* This first method contains the equation that will computate the equation */
  public static double getArea(int r) { //r for Radius and A for Area.
      double A = (r * r) * Math.PI; //double used in Area calculation as it has been multiplied by pi, which is not in the int range.
      return A;
    }
  public static void main(String[] args) {
    System.out.println("The Area of a circle is: " + getArea(5) + "."); //this prints the Area depending on the r used.
    }
}
