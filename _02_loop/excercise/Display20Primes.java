package _02_loop.exercise;

public class Display20Primes {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int demUoc = 0;
        while (count<20){
            for (int i = 2; i<= Math.sqrt(number);i++){
                if (number % i == 0){
                    demUoc++;
                    break;
                }
            }
            if (demUoc == 0){
                count += 1;
                System.out.print(count + ". ");
                System.out.println(number);
            }
            demUoc = 0;
            number += 1;
        }
    }
}
