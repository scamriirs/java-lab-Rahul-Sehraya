import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        StringBuilder binaryResult = new StringBuilder();

        if (decimalNumber == 0) {
            binaryResult.append(0);
        } else {
            int tempDecimal = decimalNumber;
            while (tempDecimal > 0) {
                int remainder = tempDecimal % 2;
                binaryResult.append(remainder);
                tempDecimal /= 2;
            binaryResult.reverse(); 
        }

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryResult.toString());
    }
}
}
