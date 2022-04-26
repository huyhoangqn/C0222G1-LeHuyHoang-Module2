package utils;

import models.Facility;

import java.io.*;
import java.util.List;

public class ReadAndWriteMaintain {
    public void writeToFile(String path, List<Facility> facilities) throws IOException {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Facility item : facilities) {
                bw.write(item.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public List<Facility> readFromFile(String path, List<Facility> facilities) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            for (Facility item : facilities) {
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return facilities;
    }
}
