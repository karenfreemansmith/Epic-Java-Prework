public class Groceries {
  public static void main(String[] args) {
    String[] myGroceryList = {"sourdough bread", "ham", "swiss cheese slices", "salmon cream cheese", "garlic butter", "spaghetti noodles", "spaghetti sauce", "rice", "cheddar cheese block", "egg noodles", "cream of mushroom soup", "sour cream", "ground beef", "corn tortillas", "clilantro", "salsa", "hot coco mix", "soy milk", "apples", "oatmeal"};
    Integer[] prices = {3,3,3,2,1,1,2,1,5,1,1,2,4,1,1,2,3,3,3,4};
    for(String item: myGroceryList) {
      System.out.println(item);
    }
    Integer total = 0;
    for(Integer price: prices) {
      total += price;
    }
    System.out.println("Your total should be about: $" + total);
  }
}
