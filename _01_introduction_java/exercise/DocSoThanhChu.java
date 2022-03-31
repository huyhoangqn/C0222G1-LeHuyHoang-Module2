package _01_introduction_java.exercise;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = scanner.nextInt();

        int hangTram = number / 100;
        int hangChuc = (number % 100) / 10;
        int hangDonVi = number % 10;

        String soThanhChu = "";

        if (number >= 0 && number <= 999) {
            switch (hangTram) {
                case 1:
                    soThanhChu = "one hundred ";
                    break;
                case 2:
                    soThanhChu = "two hundred ";
                    break;
                case 3:
                    soThanhChu = "three hundred ";
                    break;
                case 4:
                    soThanhChu = "four hundred ";
                    break;
                case 5:
                    soThanhChu = "five hundred ";
                    break;
                case 6:
                    soThanhChu = "six hundred ";
                    break;
                case 7:
                    soThanhChu = "seven hundred ";
                    break;
                case 8:
                    soThanhChu = "eight hundred ";
                    break;
                case 9:
                    soThanhChu = "nine hundred ";
                    break;
            }
            switch (hangChuc) {
                case 2:
                    soThanhChu += "twenty ";
                    break;
                case 3:
                    soThanhChu += "thirty ";
                    break;
                case 4:
                    soThanhChu += "forty ";
                    break;
                case 5:
                    soThanhChu += "fifty ";
                    break;
                case 6:
                    soThanhChu += "sixty ";
                    break;
                case 7:
                    soThanhChu += "seventy ";
                    break;
                case 8:
                    soThanhChu += "eighty ";
                    break;
                case 9:
                    soThanhChu += "ninety ";
                    break;
            }
            switch (hangDonVi) {
                case 1:
                    soThanhChu += "one";
                    break;
                case 2:
                    soThanhChu += "two";
                    break;
                case 3:
                    soThanhChu += "three";
                    break;
                case 4:
                    soThanhChu += "four";
                    break;
                case 5:
                    soThanhChu += "five";
                    break;
                case 6:
                    soThanhChu += "six";
                    break;
                case 7:
                    soThanhChu += "seven";
                    break;
                case 8:
                    soThanhChu += "eight";
                    break;
                case 9:
                    soThanhChu += "nine";
                    break;
            }
            if (hangTram == 0 && hangChuc == 0 && hangDonVi == 0) {
                soThanhChu = "zero";
            }
        } else {
            soThanhChu = "out of ability";
        }
        System.out.print(soThanhChu);
    }
}