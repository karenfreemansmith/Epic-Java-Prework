import java.io.Console;

public class Crypto {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("Enter a phrase to encrypt: ");
    String yourPhrase = c.readLine();
    String encryptedPhrase = "";
    encryptedPhrase = yourPhrase.replaceAll("S", "Steve");
    encryptedPhrase = encryptedPhrase.replaceAll("t", "tree");
    encryptedPhrase = encryptedPhrase.replaceAll("e", "i");
    encryptedPhrase = encryptedPhrase.replaceAll("v", "Dave");
    encryptedPhrase = encryptedPhrase.replaceAll("e", "X!");
    System.out.println(encryptedPhrase);
  }
}
