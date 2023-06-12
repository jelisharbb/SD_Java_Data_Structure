import java.util.Scanner;

public class BalancedParentheses {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfTest = scanner.nextInt();
    scanner.nextLine();

    String[] parentheses = new String[numberOfTest];
    for (int i = 0; i < numberOfTest; i++) {
      parentheses[i] =  scanner.nextLine();
      
    scanner.close();
    }
  }
}