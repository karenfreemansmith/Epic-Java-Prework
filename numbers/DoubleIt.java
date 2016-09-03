import java.io.Console;

public class DoubleIt {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("Give me a number you want doubled: ");
    Integer yourNumber = Integer.parseInt(c.readLine());

    Integer doubledNumber = yourNumber*2;
    System.out.println("Your new number is: " + doubledNumber);
  }
}
