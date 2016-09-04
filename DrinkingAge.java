import java.io.Console;

public class DrinkingAge {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("How old are you?");
    String strUserAge = c.readLine();
    Integer intUserAge = Integer.parseInt(strUserAge);
    if(intUserAge>=21) {
      System.out.println("Would you like beer or a glass of wine?");
    } else {
      System.out.println("Would you like root beer or a root beer float?");
    }
  }
}
