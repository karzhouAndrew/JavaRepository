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
        for (File f : path.listFiles()) {
            if (f.isDirectory()) {
                dirs.add(f.getName());
            } else {
                files.add(f.getName());
            }
        }
        try {
            BufferedWriter bwFiles = new BufferedWriter(new FileWriter
                    ("D:\\env\\Java\\JavaRepository_1\\tikhomirov\\src\\lab33\\fileResult.txt"));

            bwFiles.write("List of files: "+String.valueOf(files));
            bwFiles.flush();
            BufferedWriter bwDirs = new BufferedWriter(new FileWriter
                    ("D:\\env\\Java\\JavaRepository_1\\tikhomirov\\src\\lab33\\dirsResult.txt"));
            bwDirs.write("List of dirs: "+String.valueOf(dirs));
            bwDirs.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
