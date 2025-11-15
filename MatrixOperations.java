import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for matrices: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];
        int[][] diffMatrix = new int[rows][cols];

        System.out.println("\nEnter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEnter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("\nFirst Matrix:");
        printMatrix(matrix1);

        System.out.println("\nSecond Matrix:");
        printMatrix(matrix2);

        System.out.println("\nSum of Matrices:");
        printMatrix(sumMatrix);

        System.out.println("\nDifference of Matrices:");
        printMatrix(diffMatrix);

        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}