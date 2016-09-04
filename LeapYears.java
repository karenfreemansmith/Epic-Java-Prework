import java.io.Console;

public class LeapYears {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("What year were you born in?");
    Integer birthYear = Integer.parseInt(c.readLine());

    for(Integer year=birthYear; year<2016; year++) {
      if(year%4==0) {
        System.out.println(year);
      }
    }
  }
}
