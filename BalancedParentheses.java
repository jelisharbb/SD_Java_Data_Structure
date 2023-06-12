import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfTest = scanner.nextInt(); // ask user how many tests to do
    scanner.nextLine();

    String[] parentheses = new String[numberOfTest]; // create a string array parentheses to store the sets of parentheses
    for (int i = 0; i < numberOfTest; i++) {
      parentheses[i] =  scanner.nextLine(); // get the set of parentheses from the user and storing it in the parentheses array
    }

    String[] results = checkBalancedParentheses(parentheses); // calling the checkBalancedParentheses method to determine the balance of each set of parentheses and store the results in the results array
    for (String result: results) {
      System.out.println(result); // iterate over each result in the results array
    }

    scanner.close();
  }

  public static String[] checkBalancedParentheses(String[] parentheses) {
    String[] results = new String[parentheses.length]; // create a string array results to store the results corresponding to each set of parentheses
    
    // iterate each set of parentheses and check if balance or not
    for (int i = 0; i < parentheses.length; i++) {
      if (isBalanced(parentheses[i])) {
        results[i] = "Balanced";
      } else {
        results[i] = "Not balanced";
      }
    }

    return results;
  }

  public static boolean isBalanced(String parentheses) {
    Stack<Character> stack = new Stack<>(); // create an empty stack of characters to keep track of the opening parentheses encountered

    // iterate over each character in the parentheses string
    for (int i = 0; i < parentheses.length(); i++) {
      char eachChar = parentheses.charAt(i);

      if (eachChar == '(' || eachChar == '{' || eachChar == '[') {
        stack.push(eachChar); // if eachChar is an opening parenthesis, it is pushed onto the stack
      } else if (eachChar == ')' || eachChar == '}' || eachChar == ']') { // if eachChar is a closing parenthesis, the code checks if the stack is empty
          if (stack.isEmpty()) {
            return false; // if stack is epmty, there is no corresponding opening parenthesis for the current closing parenthesis, hence parentheses are not balanced
          }

          char topChar = stack.pop(); // if stack is not empty, the top character from the stack is popped and stored in the variable topChar
          // checks if the current closing parenthesis ch matches the top character top from the stack
          if ((eachChar == ')' && topChar != '(') || (eachChar == '}' && topChar != '{') || (eachChar == ']' && topChar != '[')) {
            return false;
          }
      }
    }

    return stack.isEmpty();
  }
}