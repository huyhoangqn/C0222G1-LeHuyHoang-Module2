package _01_introduction_java.exercise;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rate = 23000;

        System.out.print("Enter USD: ");
        float usd = scanner.nextFloat();
        float vnd = usd * rate;

        System.out.printf(" USD Exchange to VND is: "+ vnd);
    }
}