package _03_loop.exercise;

import java.util.Scanner;

public class FindTheLargestInTwoDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng : ");
        int inputrow = scanner.nextInt();
        System.out.print("Nhập số cột : ");
        int inputcolum = scanner.nextInt();
        System.out.print(maxNumber(inputrow,inputcolum));

    }

    public static int maxNumber(int row, int colum ){
        Scanner scanner = new Scanner(System.in);
        int [][] array = new int[row][colum];
        int max = array[0][0];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < colum ; j++) {
                System.out.print("array["+i+"]["+j+"] :"  );
                array[i][j] = scanner.nextInt();
                if (array[i][j] > max){
                    max = array[i][j]  ;
                }
            }
        }
        return max;
    }
}
