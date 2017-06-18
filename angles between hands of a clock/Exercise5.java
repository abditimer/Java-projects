package Ex5;

/* Computing the angle behind the hour and the minute hand on a traditional analogue clock.
* My reasoning is provided as comments to explain why I did something.
* @author Abdikhaliq Timer
* @2016-10-06
*/

public class Exercise5 {  //Name of this class is the exercise number for easy identification.
  public static int getAngle(int hour, int minutes) { //We will need two variables, the hour and minutes.
    /* initial step of calculation converts the question from a 24 hour clock into a 12 hour clock */
    double hours = hour % 12;  
    /* Converting the hour into an angle, as there are 12 hours in 360 degrees, 
       considering the movement of the hour hand between full hour turns.*/
    double hour2Angle = (hours * 30) + (minutes * 0.5);
    /* Similar method used again to convert minutes into hour. As there are 60 minutes within a 360 degree cycle,
       which results in 1 minute equalling a 6 degree turn.*/
    double minutes2Angle = (minutes * 6);
    /* Below, I have split up the next computations to allow for a more accurate result.
       differenceInAngle is for when the hour position is ahead of the minute hand, whereas,
       the getAngle is for when the minte hand is larger.*/
    double getBigAngle = hour2Angle - minutes2Angle;
    double getSmallAngle = 360 - (minutes2Angle - hour2Angle);
    /* The following rounds them both up/down usign the variables below*/ 
    double roundBigAngle = Math.round(getBigAngle);
    double roundSmallAngle = Math.round(getSmallAngle);
    /* The exercise asks for the final answers as a whole number, an int, hence I need to convert them*/
    int finalBigAngle = (int) roundBigAngle;
    int finalSmallAngle = (int) roundSmallAngle;
    /* An if statement will be used to determine which angle will give you what the Exercise needed, 
       the angle between the hour hand and the minute hand.*/
    if (minutes2Angle < hour2Angle) 
      return finalBigAngle;
    
    else 
      return finalSmallAngle;
    /* The main method will have all the print functions needed to answer the exercise, allowing for easy change in the future.*/
  }
  public static void main(String[] args) {
    System.out.println("The anticlockwise angle between the inputed times are:  "); //Small sentence to give the user some information.
    System.out.println("09:00  :" + getAngle(9,00) + "\u00b0."); //this uses the inputed information to calculate the angle.
    System.out.println("03:00  :" + getAngle(3,00) + "\u00b0."); //the unicode for degrees is added.
    System.out.println("18:00  :" + getAngle(18,00) + "\u00b0.");
    System.out.println("01:00  :" + getAngle(1,00) + "\u00b0.");
    System.out.println("02:30  :" + getAngle(2,30) + "\u00b0.");
    System.out.println("04:41  :" + getAngle(4,41) + "\u00b0.");
  }
}
