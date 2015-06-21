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
        List<String> filesNames = new ArrayList<>();
        if (DIRECTORY.isDirectory()) {
            File[] directoryObjects = DIRECTORY.listFiles();
            for (File object : directoryObjects) {
                if (object.isFile()) {
                    filesNames.add(object.getName());
                }
            }
        }
        return filesNames;
    }

    public List<String> getDirectories() {
        List<String> directoriesNames = new ArrayList<>();
        if (DIRECTORY.isDirectory()) {
            File[] directoryObjects = DIRECTORY.listFiles();
            for (File object : directoryObjects) {
                if (object.isDirectory()) {
                    directoriesNames.add(object.getName());
                }
            }
        }
        return directoriesNames;
    }
}
