package _03_loop.exercise;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        String string = "qwertyuigdfshuytt";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (c == string.charAt(i)) {
                count += 1;
            }
        }
        System.out.println("frequency of appearance of " + c + " in string is " + count);
    }
}
