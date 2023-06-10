import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the number of binary number(s) you want to convert: ");
        int size = scanner.nextInt();

        scanner.close();
    }
}