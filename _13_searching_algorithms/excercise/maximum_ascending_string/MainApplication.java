package _13_searching_algorithms.excercise.maximum_ascending_string;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String string = scanner.nextLine();

        ProcessClass processClass = new ProcessClass();
        processClass.process(string);
    }
}
