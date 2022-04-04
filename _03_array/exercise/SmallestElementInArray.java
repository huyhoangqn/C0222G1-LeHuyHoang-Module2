package _03_loop.exercise;

import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        array = initArray(size);
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int index = minValue(array);
        int min = array[index];
        System.out.println();
        System.out.println("The minimum property value in the list is " + min + " ,at position " + (index + 1));
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int[] initArray(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        return array;
    }
}
