package _03_loop.exercise;

import java.util.Scanner;

public class SumOfDiagonalPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = Integer.parseInt(scanner.nextLine());
        double[][] arrays = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element " + (i + 1) + "_" + (j + 1) + " ");
                arrays[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arrays[i][i];
        }
        System.out.println("Sum of elements at main diagonal of matrix is " + sum);
    }
}
