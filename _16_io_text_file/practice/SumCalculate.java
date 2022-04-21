package _16_io_text_file.practice;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class SumCalculate {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        File f2 = new File("C:\\Users\\lehuy\\Desktop\\HHHHH\\sum.txt");
        List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
        for (String line : allText) {
            sum += Integer.parseInt(line);
        }
        System.out.println(sum);
    }
}
