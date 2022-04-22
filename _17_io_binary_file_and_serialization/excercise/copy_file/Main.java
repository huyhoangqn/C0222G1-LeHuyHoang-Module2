package _17_io_binary_file_and_serialization.excercise.copy_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException, FileWasExistException {
        try {
            File sourcePath = new File("C:\\Users\\lehuy\\Desktop\\HHHHH\\root\\okela.txt");

            if (!sourcePath.exists()) {
                throw new FileNotFoundException();
            }
            File destPath = new File("C:\\Users\\lehuy\\Desktop\\HHHHH\\target\\okela.txt");
            if (destPath.exists()) {
                throw new FileWasExistException("File was exist");
            }
            File root = new File(String.valueOf(sourcePath));
            File target = new File(String.valueOf(destPath));
            Files.copy(root.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copy complete");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (FileWasExistException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
