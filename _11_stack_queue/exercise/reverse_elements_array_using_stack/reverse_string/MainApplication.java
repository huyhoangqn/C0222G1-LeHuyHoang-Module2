package _11_stack_queue.reverse_elements_array_using_stack.reverse_string;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnterString enterString = new EnterString();

        String[] string = enterString.string(scanner);
        System.out.println("String before reverse: ");
        System.out.println(Arrays.toString(string));

        Reverse reverse = new Reverse();
        String[] string1 = reverse.reverse(string);
        System.out.println("String after reverse: ");
        System.out.println(Arrays.toString(string1));
    }
}
