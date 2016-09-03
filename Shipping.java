import java.io.Console;

public class Shipping {
  public static void main (String[] args) {
    Console c = System.console();

    System.out.println("What are you shipping?");
    String item = c.readLine();
    System.out.println("What does it weigh?");
    Float weight = Float.parseFloat(c.readLine());
    System.out.println("How many miles do you want to ship it?");
    Float miles = Float.parseFloat(c.readLine());
    Float cost = weight*miles*3/1000;
    System.out.println("It will cost $" + Float.toString(cost) + " to ship your " + item + ".");
  }
}
