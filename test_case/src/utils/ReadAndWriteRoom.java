package utils;

import models.Room;

import java.io.*;
import java.util.List;

public class ReadAndWriteRoom {
    public void writeToFile(String path, List<Room> rooms) throws IOException {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Room item : rooms) {
                bw.write(item.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public List<Room> readFromFile(String path, List<Room> rooms) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            for (Room item : rooms) {
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return rooms;
    }
}
