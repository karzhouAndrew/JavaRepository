package lab33;

import java.io.File;

/**
 * Created by Master on 08.06.2015.
 */
public class ListFile {

    public void listFilesAndFolders() {
        File directory = new File("../../../Book");
        File array[] = directory.listFiles();
        StringBuilder listDirectory = new StringBuilder();
        StringBuilder listFile = new StringBuilder();
        for (File file : array) {
            if (file.isDirectory()) {
                listDirectory.append(file.getName() + "; ");
            } else {
                listFile.append(file.getName() + "; ");
            }
        }
        System.out.println(directory.getAbsolutePath());
        System.out.println("Список папок " + listDirectory);
        System.out.println("Список файлов " + listFile);
    }
}
