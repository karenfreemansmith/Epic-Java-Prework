import java.io.Console;

public class MealTime {
  public static void main(String[] args) {
    whatYouAte("breakfast");
    whatYouAte("lunch");
    whatYouAte("dinner");
  }

  public static void whatYouAte(String meal) {
    Console c = System.console();
    System.out.println("What did you eat for " + meal + "?");
    String yourMeal = c.readLine();
    System.out.println("That sound good. I wish I had " + yourMeal + " for " + meal + ".");
  }
}
