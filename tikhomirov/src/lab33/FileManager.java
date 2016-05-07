package lab33;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */
public class FileManager {
    public static void main(String[] args) {
        File path = new File("D:\\env\\Projects");
        List<String> files = new ArrayList<String>();
        List<String> dirs = new ArrayList<String>();
        for (File file : path.listFiles()) {
            if (file.isDirectory()) {
                dirs.add(file.getName());
            } else {
                files.add(file.getName());
            }
        }
        BufferedWriter bwFiles = null;
        BufferedWriter bwDirs = null;
        try {
            bwFiles = new BufferedWriter(new FileWriter("tikhomirov\\src\\lab33\\fileResult.txt"));

            bwFiles.write("List of files: " + String.valueOf(files));
            bwFiles.flush();
            bwDirs = new BufferedWriter(new FileWriter("tikhomirov\\src\\lab33\\dirsResult.txt"));
            bwDirs.write("List of dirs: " + String.valueOf(dirs));
            bwDirs.flush();
            bwFiles.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bwDirs.close();
                bwFiles.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
