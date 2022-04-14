package _11_stack_queue.counting_using_map;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnterString enterString = new EnterString();
        String string = enterString.string(scanner);

        TreeMap treeMap = new TreeMap();
        treeMap.treeMap(string);
    }
}
