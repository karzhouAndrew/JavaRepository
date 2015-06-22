package lab32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private String path;

    public FileManager(String path) {
        setPath(path);
    }

    public List<String> readFile(String path) {
        List<String> data = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNext()) {
                data.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return data;
    }

    public void writeFile(List<String> data) {
        try (DataOutputStream dataOutputStream = (new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path))))) {
            for (String value : data) {
                dataOutputStream.writeBytes(value);
                dataOutputStream.writeBytes(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot write in file.");
        }
    }

    public void removeFile(String path) {
        try {
            File newFile = new File(path);
            newFile.delete();
        } catch (Exception e) {
            System.out.println("Cannot remove file.");
            e.printStackTrace();
        }
    }

    public void createFile() {
        File newFile = new File(path);
        try {
            newFile.getParentFile().mkdir();
            newFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Cannot create file.");
            e.printStackTrace();
        }
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
