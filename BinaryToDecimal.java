import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the number of binary number(s) you want to convert: ");
        int size = scanner.nextInt();

        int[] binaryArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Binary number " + (i + 1) + ": ");
            int binary = scanner.nextInt();
            binaryArray[i] = binary;
        }

        scanner.close();

        int[] decimalArray = new int[binaryArray.length];
        for (int i = 0; i < binaryArray.length; i++) {
            String binaryString = String.valueOf(binaryArray[i]); 
            decimalArray[i] = Integer.parseInt(binaryString, 2);
        }

        for (int i = 0; i < decimalArray.length; i++) {
            int decimal = decimalArray[i];
            System.out.println("Decimal number " + (i + 1) + ": " + decimal);
        }
    }
}