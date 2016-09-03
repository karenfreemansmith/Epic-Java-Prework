import java.io.Console;

public class FavoriteThings {
  public static void main (String[] args) {
    Console myConsole = System.console();

    System.out.println("What is your favorite color?");
    String favoriteColor = myConsole.readLine();
    // null pointer exception when running program in git bash
    // running with command prompt fixes it
    System.out.println("Your favorite color is " + favoriteColor + "? Me too!!");
  }
}
