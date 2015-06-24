package Lab32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFile {

    public static List<Integer> readFile(String fileName) throws IOException {
        DataInputStream data = null;
        List<Integer> list = new ArrayList<Integer>();
        try {
            data = new DataInputStream(new BufferedInputStream((new FileInputStream(fileName))));
            while (true) {
                try {
                    list.add(data.readInt());
                } catch (EOFException e) {
                    break;
                }
            }
        } finally {
            if (data != null) {
                data.close();
            }
        }
        return list;
    }

    public static float calculateAverage(List<Integer> list) {
        int sumNumbers = 0;
        for (Integer number : list) {
            sumNumbers += number;
        }
        float average = (float) sumNumbers / list.size();
        return average;

    }

    public void writeRandomNumbersInFile(String filename) throws IOException {
        DataOutputStream data;
        try {
            data = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            data.writeInt((int) (Math.random() * 20 + 1));
        }
        data.close();
    }
}
