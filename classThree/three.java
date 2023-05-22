package classThree;

import java.util.Scanner;

public class three {
    Scanner input = new Scanner(System.in);

    public void average() {

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / n;

        System.out.println("Average: " + average);
    }

    public void largest() {
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest element: " + max);
    }

    public void addMatrix() {
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        System.out.println("Enter elements of first matrix:");
        enterElements(matrix1);

        System.out.println("Enter elements of second matrix:");
        enterElements(matrix2);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        printMatrix(sumMatrix);
    }

    public void transpose() {
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] transposeMatrix = new int[columns][rows];

        System.out.println("Enter elements of the matrix:");
        enterElements(matrix);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        printMatrix(transposeMatrix);
    }

    private static void enterElements(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void printArray() {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("Array elements:");
        printArray(numbers);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void arrayCnct() {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };

        int n1 = array1.length;
        int n2 = array1.length;
        int[] array3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (array1[i] < array2[i]) {
                array3[k] = array1[i];
                i++;
                k++;
            } else {
                array3[k] = array2[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            array3[k] = array1[i];
            i++;
            k++;
        }
        while (j < n2) {
            array3[k] = array2[j];
            j++;
            k++;
        }
        for (int m : array3) {
            System.out.print(m + " ");
        }

    }

    public void containsValue() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int target = 3;

        boolean contains = containsValue(numbers, target);

        System.out.println("Array contains " + target + ": " + contains);
    }

    private static boolean containsValue(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
