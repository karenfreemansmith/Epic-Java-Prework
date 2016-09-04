import java.io.Console;

public class HotelRate{
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("What season will you be staying with us?");
    String season = c.readLine();

    System.out.println("Will you be staying on the weekend or a weekday?");
    String dayOfWeek = c.readLine();

    boolean summer = season.equals("summer");
    boolean weekend = dayOfWeek.equals("weekend");

    if(summer&&weekend) {
      System.out.println("Make sure you pay down your credit card before coming - your stay will be very expensive.");
    } else if (summer||weekend) {
      System.out.println("Your stay won't cost you an arm AND a leg.");
    } else {
      System.out.println("You picked the least expensive time to stay here.");
    }
  }
}
