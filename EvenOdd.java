import java.io.Console;

public class EvenOdd {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("Enter a number: ");
    Integer yourNumber = Integer.parseInt(c.readLine());

    for(Integer i=1; i<=yourNumber; i++) {
      if(i%2==0) {
        System.out.println(i + " is even");
      } else {
        System.out.println(i + " is odd");
      }
    }
  }
}
