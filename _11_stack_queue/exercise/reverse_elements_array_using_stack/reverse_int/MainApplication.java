package _11_stack_queue.reverse_elements_array_using_stack.reverse_int;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = Integer.parseInt(scanner.nextLine());
        IntArray intArray = new IntArray();
        int[] arr = intArray.array(size);

        System.out.print("Array before reverse: ");
        System.out.println(Arrays.toString(arr));

        Reverse reverse = new Reverse();
        reverse.reverse(arr);
    }

}
