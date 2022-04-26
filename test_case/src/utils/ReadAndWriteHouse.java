package utils;

import models.House;

import java.io.*;
import java.util.List;

public class ReadAndWriteHouse {
    public void writeToFile(String path, List<House> houses) throws IOException {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (House item : houses) {
                bw.write(item.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public List<House> readFromFile(String path, List<House> houses) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            for (House item : houses) {
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return houses;
    }
}
