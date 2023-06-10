import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the number of binary number(s) you want to convert: ");
        int size = scanner.nextInt();

        int[] binaryArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the binary number: ");
            int binary = scanner.nextInt();
            binaryArray[i] = binary;
        }

        scanner.close();
    }
}