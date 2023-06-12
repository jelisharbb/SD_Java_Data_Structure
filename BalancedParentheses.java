import java.util.Scanner;

public class BalancedParentheses {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfTest = scanner.nextInt();
    scanner.nextLine();

    String[] parentheses = new String[numberOfTest];
    for (int i = 0; i < numberOfTest; i++) {
      parentheses[i] =  scanner.nextLine();
    }

    String[] results = checkBalancedParentheses(parentheses);
    for (String result: results) {
      System.out.println(result);
    }

    scanner.close();
  }

  public static String[] checkBalancedParentheses(String[] parentheses) {
    String[] results = new String[parentheses.length];
    
    for (int i = 0; i < parentheses.length; i++) {
      if (isBalanced(parentheses[i])) {
        results[i] = "Balanced";
      } else {
        results[i] = "Not balanced";
      }
    }

    return results;
  }
}