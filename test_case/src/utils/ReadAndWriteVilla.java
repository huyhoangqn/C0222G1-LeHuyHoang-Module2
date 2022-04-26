package utils;

import models.Villa;

import java.io.*;
import java.util.List;

public class ReadAndWriteVilla {
    public void writeToFile(String path, List<Villa> villas) throws IOException {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Villa item : villas) {
                bw.write(item.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public List<Villa> readFromFile(String path, List<Villa> villas) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            for (Villa item : villas) {
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return villas;
    }
}
