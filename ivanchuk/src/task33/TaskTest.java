package task33;

//Вывести список файлов и каталогов выбранного каталога на диске.
//Файлы и каталоги должны быть распечатаны отдельно.

public class TaskTest {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager(".");
        System.out.println("Список катологов: " + fileManager.getDirectories());
        System.out.println("Список файлов: " + fileManager.getFiles());
    }
}
