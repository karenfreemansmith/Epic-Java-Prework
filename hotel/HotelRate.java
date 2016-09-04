import java.io.Console;

public class HotelRate{
  public static void main(String[] args) {
    Console c = System.console();

    // System.out.println("What season will you be staying with us?");
    // String season = c.readLine();
    String season = "summer";
    
    System.out.println("Will you be staying on the weekend or a weekday?");
    String dayOfWeek = c.readLine();

    boolean summer = season == "summer\n";
    boolean weekend = dayOfWeek == "weekend";

    if(season=="summer") {
      System.out.println("You spelled it right...");
    } else {
      System.out.println("Try again...summer seems to be spelled wrong: " + season);
    }
    //System.out.println(dayOfWeek + ": " + weekend);
    // this is not working, both summer and weekend are false for some reason???

    if(summer&&weekend) {
      System.out.println("Make sure you pay down your credit card before coming - your stay will be very expensive.");
    } else if (summer||weekend) {
      System.out.println("Your stay won't cost you an arm AND a leg.");
    } else {
      System.out.println("You picked the least expensive time to stay here.");
    }
  }
}
