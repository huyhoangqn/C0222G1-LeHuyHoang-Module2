package utils;

import models.Employee;

import java.io.*;
import java.util.List;

public class ReadAndWriteEmployee {
    public void writeToFile(String path, List<Employee> employees) throws IOException {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Employee item : employees) {
                bw.write(item.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public List<Employee> readFromFile(String path, List<Employee> employees) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            for (Employee item : employees) {
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return employees;
    }
}
