import java.io.Console;

public class Divide {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("Enter 1st number: ");
    Integer firstNumber = Integer.parseInt(c.readLine());
    System.out.println("Enter 2nd number: ");
    Integer secondNumber = Integer.parseInt(c.readLine());
    Integer theAnswer = firstNumber/secondNumber;
    System.out.println(Integer.toString(firstNumber) + " divided by " + Integer.toString(secondNumber) + " equals " + Integer.toString(theAnswer));
    
  }
}
