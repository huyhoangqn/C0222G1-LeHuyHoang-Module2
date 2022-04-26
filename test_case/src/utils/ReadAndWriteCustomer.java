package utils;

import models.Customer;

import java.io.*;
import java.util.List;

public class ReadAndWriteCustomer {
    public void writeToFile(String path, List<Customer> customers) throws IOException {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Customer item : customers) {
                bw.write(item.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public List<Customer> readFromFile(String path, List<Customer> customers) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            for (Customer item : customers) {
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return customers;
    }
}
