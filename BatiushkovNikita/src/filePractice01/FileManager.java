package filePractice01;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    private String path;

    public FileManager(String path) {
        setPath(path);
        createFile();
    }

    public String[] readFile() {
        StringBuilder data = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNext()) {
                data.append(scanner.next());
                data.append(" ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return data.toString().split("\\s+");
    }

    public void writeFile(String[] values) {
        try (DataOutputStream dataOutputStream = (new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path))))) {
            for (String value : values) {
                dataOutputStream.writeBytes(value);
                dataOutputStream.writeBytes(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot write in file.");
        }
    }

    public void removeFile() {
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
