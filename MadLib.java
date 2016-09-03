import java.io.Console;

public class MadLib {
  public static void main (String[] args) {
    Console c = System.console();

    System.out.println("Enter a noun: ");
    String myNoun = c.readLine();
    System.out.println("Enter a verb: ");
    String myVerb = c.readLine();
    System.out.println("Thank you for " + myVerb + " a/an " + myNoun + ".");

  }
}
