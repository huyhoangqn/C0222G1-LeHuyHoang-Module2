package _11_stack_queue.reverse_elements_array_using_stack.reverse_string;

import java.util.Scanner;

public class EnterString {
    public String[] string(Scanner scanner) {
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        string = string.trim();
        return string.split(" ");
    }
}
