package lab12;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    public String readFile(String path) {
        StringBuilder data = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNext()) {
                data.append(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return data.toString();
    }

    public void writeFile(String value, String path) {
        try (DataOutputStream dataOutputStream = (new DataOutputStream(new FileOutputStream(path)))) {
            dataOutputStream.writeBytes(value);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot write in file.");
        }
    }
}
