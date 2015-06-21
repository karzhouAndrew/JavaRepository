package lab33;

/**
 * Вывести список файлов и каталогов выбранного каталога на диске.
 * Файлы и каталоги должны быть распечатаны отдельно.
 */
public class Task {
    public static void main(String[] args) {
        DirectoryWork directory = new DirectoryWork();
        directory.printDirectoryContents("./");
    }
}
