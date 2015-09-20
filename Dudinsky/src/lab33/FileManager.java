package lab33;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    File[] filesAndDirs;

    public FileManager(String givenPath) {
        filesAndDirs = new File(givenPath).listFiles();
    }

    public List<String> getFiles() {
        List<String> files = new ArrayList<>();
        for (File currentElem : filesAndDirs) {
            if (currentElem.isFile()) {
                files.add(currentElem.getName());
            }
        }
        return files;
    }

    public List<String> getDirectories() {
        List<String> dirs = new ArrayList<>();
        for (File currentElem : filesAndDirs) {
            if (currentElem.isDirectory()) {
                dirs.add(currentElem.getName());
            }
        }
        return dirs;
    }
}
