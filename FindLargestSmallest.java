import java.util.Scanner;
public class FindLargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number of elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int currentNumber = scanner.nextInt();

            if (currentNumber > largest) {
                largest = currentNumber;
            }

            if (currentNumber < smallest) {
                smallest = currentNumber;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}