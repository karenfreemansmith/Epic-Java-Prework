public class Eating {
  public static void main(String[] args) {
    String[] foods = {"cheesecake", "ice cream", "steak", "baked potato", "shushi", "coconut chicken", "tacos", "chocolate", "grapes", "cheese", "sourdough toast"};
    for(Integer i=0; i<foods.length/2; i++) {
      System.out.println("I am eating " + foods[i] + "...");
    }
    System.out.println("I am full.");
  }
}
