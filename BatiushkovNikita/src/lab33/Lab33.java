package lab33;

// Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Lab33 {
    private static final String ANALYZED_PATH = ".";
    private static final String FILES = "./BatiushkovNikita/src/lab33/Files.txt";
    private static final String DIRS = "./BatiushkovNikita/src/lab33/Dirs.txt";

    public static void main(String[] args) {
        FileManager files = new FileManager(FILES);
        FileManager dirs = new FileManager(DIRS);

        files.writeFile(obtainFiles(ANALYZED_PATH));
        dirs.writeFile(obtainDirs(ANALYZED_PATH));
    }

    public static List<String> obtainDirs(String path) {
        List<String> dirs = new ArrayList<>();
        File[] dirsAndFiles = new File(path).listFiles();
        if (dirsAndFiles != null) {
            for (File cell : dirsAndFiles) {
                if (cell.isDirectory()) {
                    dirs.add(cell.getName());
                }
            }
        }
        return dirs;
    }

    public static List<String> obtainFiles(String path) {
        List<String> files = new ArrayList<>();
        File[] dirsAndFiles = new File(path).listFiles();
        if (dirsAndFiles != null) {
            for (File cell : dirsAndFiles) {
                if (cell.isFile()) {
                    files.add(cell.getName());
                }
            }
        }
        return files;
    }
}
