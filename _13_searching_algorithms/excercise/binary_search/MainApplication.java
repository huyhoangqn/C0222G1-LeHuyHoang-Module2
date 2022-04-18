package _13_searching_algorithms.excercise.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CreateArray createArray = new CreateArray();
        System.out.println("Enter array length: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = createArray.create(size);

        System.out.println("Enter value you want to find.");
        int value = Integer.parseInt(scanner.nextLine());

        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.search(arr, value);

        System.out.println("Array added: ");
        System.out.println(Arrays.toString(arr));
        if (index != -1) {
            System.out.println(value + " at index " + index);
        } else {
            System.out.println("Result: \n" + value + " doesn't exist in array");
        }

    }
}
