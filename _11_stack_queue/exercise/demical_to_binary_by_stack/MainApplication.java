package _11_stack_queue.demical_to_binary_by_stack;

import java.util.Scanner;

class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Demical number: ");
        int input = Integer.parseInt(scanner.nextLine());
        Convert convert = new Convert();
        System.out.print("Binary of " + input + " is :");
        convert.convertBinary(input);
    }
}
