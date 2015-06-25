package lab33;
/**
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */

import java.io.File;

public class Lab33Main {
    public static void main(String[] args) {
        File root = new File("D:/");
        searchFolders(root);
        searchFiles(root);
    }

    public static void searchFiles(File root) {
        File[] listOfFiles = root.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("[File] " + file.getName());
            }
        }
    }


    public static void searchFolders(File root) {
        File[] listOfFolders = root.listFiles();

        for (File folder : listOfFolders) {
            if (folder.isDirectory()) {
                System.out.println("[Directory] " + folder.getName());
            }
        }
    }
}
