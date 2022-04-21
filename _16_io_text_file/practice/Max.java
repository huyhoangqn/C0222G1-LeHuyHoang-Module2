package _16_io_text_file.practice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Max {
    public static void main(String[] args) throws IOException {
        int max = 0;
        int sum = 0;
        File f2 = new File("C:\\Users\\lehuy\\Desktop\\HHHHH\\sum.txt");
        List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
        for (String line : allText) {
            sum += Integer.parseInt(line);
            if (Integer.parseInt(line) > max) {
                max = Integer.parseInt(line);
            }
        }
        try {
            PrintWriter printWriter = new PrintWriter("C:\\Users\\lehuy\\Desktop\\HHHHH\\result.txt", "UTF-8");
            printWriter.println("Max: " + max);
            printWriter.flush();
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}