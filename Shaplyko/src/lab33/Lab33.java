package lab33;

import java.io.File;

/**
 * Задание 33
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */
public class Lab33 {
    public static void main(String[] args) {
        Files file = new Files("./src/file.txt");
        Files dir = new Files("./src/dir.txt");
        File path = new File("E:/");
        file.writeToListFile(path);
        file.writeFile();
        dir.writeToListDir(path);
        dir.writeFile();
    }
}
