package _11_stack_queue.counting_using_map;

import java.util.Scanner;

public class EnterString {
    public String string (Scanner scanner){
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        string = string.replaceAll(" ", "");
        return string;
    }
}
