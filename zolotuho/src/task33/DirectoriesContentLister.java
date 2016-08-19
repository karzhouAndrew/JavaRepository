package task33;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoriesContentLister {
    private List<String> directories = new ArrayList<>();
    private List<String> files = new ArrayList<>();

    public void createListDirectories(String path) {
        File folder = new File(path);
        File[] allFiles = folder.listFiles();
        if (allFiles != null) {
            for (File allFile : allFiles) {
                if (!allFile.isFile()) {
                    directories.add(allFile.toString());
                }
            }
        }
    }

    public void createListFiles(String path) {
        File folder = new File(path);
        File[] allFiles = folder.listFiles();
        if (allFiles != null) {
            for (File allFile : allFiles) {
                if (allFile.isFile()) {
                    files.add(allFile.toString());
                }
            }
        }
    }

    public void printDirectories() {
        for (String directory : directories) {
            System.out.println(directory);
        }
    }

    public void printFiles() {
        for (String file : files) {
            System.out.println(file);
        }
    }
}
