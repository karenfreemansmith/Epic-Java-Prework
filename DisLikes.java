public class DisLikes {
  public static void main (String[] args) {
    String[] stuff = {"liver", "loud noises", "spiders"};
    System.out.println("Things I don't like: " + stuff[0] + ", " + stuff[1] + ", and " + stuff[2]);
    stuff[0]="cheesecake";
    stuff[1]="running water";
    stuff[2]="kittens";
    System.out.println("Things I do like: " + stuff[0] + ", " + stuff[1] + ", and " + stuff[2]);
  }
}
