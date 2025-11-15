import java.util.Scanner;

public class HCFCalculator {

    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int hcf = findHCF(number1, number2);
        System.out.println("The HCF of " + number1 + " and " + number2 + " is: " + hcf);

        scanner.close();
    }
}