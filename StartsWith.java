import java.io.Console;

public class StartsWith {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("What's your name?");
    String userName = c.readLine();

    if(userName.startsWith("Z")) {
      System.out.println("Your name starts with a Z!");
    } else {
      System.out.println("Your name does not start with a Z.");
    }
  }
}
