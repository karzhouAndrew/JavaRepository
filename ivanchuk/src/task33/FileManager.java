package task33;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private final File DIRECTORY;

    public FileManager(String directoryName) {
        DIRECTORY = new File(directoryName);
    }

    public List<String> getFiles() {
        List<String> files = new ArrayList<>();
        if (DIRECTORY.isDirectory()) {
            File[] directoryObjects = DIRECTORY.listFiles();
            for (File object : directoryObjects) {
                if (object.isFile()) {
                    files.add(object.getName());
                }
            }
        }
        return files;
    }

    public List<String> getDirectories() {
        List<String> directories = new ArrayList<>();
        if (DIRECTORY.isDirectory()) {
            File[] directoryObjects = DIRECTORY.listFiles();
            for (File object : directoryObjects) {
                if (object.isDirectory()) {
                    directories.add(object.getName());
                }
            }
        }
        return directories;
    }
}
