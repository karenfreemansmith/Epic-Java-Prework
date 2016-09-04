import java.io.Console;

public class NumberCheck {
  public static void main (String[] args) {
    Console c = System.console();

    System.out.println("Tell me a 2-digit number: ");
    Integer yourNumber = Integer.parseInt(c.readLine());
    if((yourNumber>9) && (yourNumber<100)) {
      System.out.println("YES! You know what a 2-digit number is!");
    } else {
      System.out.println("Umm...no...that is not a 2-digit number. Maybe you shoud take a math class?");
    }
  }
}
