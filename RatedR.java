import java.io.Console;

public class RatedR {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("How old are you?");
    String stringUserAge = c.readLine();
    Integer integerUserAge = Integer.parseInt(stringUserAge);

    if(integerUserAge>=17) {
      System.out.println("You can see the movie!");
    } else {
      System.out.println("I'm sorry, you are too young for that movie.");
    }
  }
}
