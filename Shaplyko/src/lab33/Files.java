package lab33;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Files {
    private File file;
    private List<String> enumeration = new ArrayList<String>();

    public Files(String path) {
        this.file = new File(path);
    }

    public void writeToListFile(File path) {
        for (File f : path.listFiles()) {
            if (f.isFile()) {
                enumeration.add(f.getName());
            }
        }
    }

    public void writeToListDir(File path) {
        for (File f : path.listFiles()) {
            if (f.isDirectory()) {
                enumeration.add(f.getName());
            }
        }
    }

    public void writeFile() {
        DataOutputStream outputFile = null;
        try {
            outputFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            writeNumbers(enumeration, outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Не могу открыть файл");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        } finally {
            if (outputFile != null) {
                try {
                    outputFile.close();
                } catch (IOException e) {
                    System.out.println("Не могу закрыть файл");
                }
            }
        }
    }

    private void writeNumbers(List<String> enumeration, DataOutputStream outputFile) throws IOException {
        for (int i = 0; i < enumeration.size(); i++) {
            outputFile.writeUTF(enumeration.get(i));
        }
    }
}

