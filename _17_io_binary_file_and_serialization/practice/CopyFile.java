package _17_io_binary_file_and_serialization.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


public class CopyFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sourcePath");
        File sourcePath = new File(scanner.nextLine());

        System.out.println("Enter destPath:");
        File destPath = new File(scanner.nextLine());

        File root = new File(String.valueOf(sourcePath));
        File target = new File(String.valueOf(destPath));
        Files.copy(root.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
