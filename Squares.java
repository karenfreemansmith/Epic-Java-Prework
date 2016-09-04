public class Squares {
  public static void main (String[] args) {
    Integer[] numbers = {2, 4, 6};
    System.out.println("Original Array: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
    numbers[0]*=numbers[0];
    numbers[1]*=numbers[1];
    numbers[2]*=numbers[2];
    System.out.println("Squared Array: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
  }
}
