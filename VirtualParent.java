import java.io.Console;

public class VirtualParent {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("What grade did you get in your last class?");
    String yourGrade = c.readLine();

    if((yourGrade.equals("A"))||(yourGrade.equals("B"))) {
      System.out.println("I'm so proud of you! Keep up the good work.");
    } else if (yourGrade.equals("C")) {
      System.out.println("You shoud try a little harder.");
    } else if ((yourGrade.equals("D"))||(yourGrade.equals("F"))) {
      System.out.println("You're grounded until your grades improve.");
    } else {
      System.out.println("Sorry, I didn't understand that...");
    }
  }
}
