package lab33;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryWork {

    public List<String> getFolders(String path) {
        List<String> folders = new ArrayList<>();
        File directory = new File(path);
        File[] directoryContents = directory.listFiles();
        if (directoryContents.length != 0) {
            for (File element : directoryContents) {
                if (element.isDirectory()) {
                    folders.add(element.getName());
                }
            }
        }
        if (folders.isEmpty()) {
            folders.add("Empty");
        }
        return folders;
    }

    public List<String> getFiles(String path) {
        List<String> files = new ArrayList<>();
        File directory = new File(path);
        File[] directoryContents = directory.listFiles();
        if (directoryContents.length != 0) {
            for (File element : directoryContents) {
                if (element.isFile()) {
                    files.add(element.getName());
                }
            }
        }
        if (files.isEmpty()) {
            files.add("Empty");
        }
        return files;
    }

    public void printDirectoryFolders(String path) {
        List<String> folders = getFolders(path);
        System.out.println("Папки : ");
        for (String folder : folders) {
            System.out.println(folder);
        }
    }

    public void printDirectoryFiles(String path) {
        List<String> files = getFiles(path);
        System.out.println("Файлы : ");
        for (String file : files) {
            System.out.println(file);
        }
    }

    public void printDirectoryContents(String path) {
        File directory = new File(path);
        if (directory.exists()) {
            printDirectoryFolders(path);
            System.out.println();
            printDirectoryFiles(path);
        } else {
            System.out.println("Такого каталога не существует.");
        }
    }
}
