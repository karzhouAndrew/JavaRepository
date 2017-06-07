package lab33;

/*Задание 33. Вывести список файлов и каталогов выбранного каталога на диске.
Файлы и каталоги должны быть распечатаны отдельно.
УТОЧНЯЮ ЗАДАЧУ: для исключения знаков ".\" и "..\" из вывода допускается создать в памяти дополнительные String'и,
соответствующие именам каждого файла или папки (без указания в них пути) */

import java.io.File;

public class Task33 {

    private static final String GIVEN_PATH = ".";

    public static void main(String[] args) {
        if (new File(GIVEN_PATH).exists()) {
            FileManager fileManager = new FileManager(GIVEN_PATH);
            System.out.println("Файлы:\n" + fileManager.getFiles());
            System.out.println("Каталоги:\n" + fileManager.getDirectories());
        } else {
            System.out.println("Выбранный путь не существует: " + GIVEN_PATH);
        }
    }
}

/*Result:
Файлы:
[Task33.iml]
Каталоги:
[.idea, out, src]
*/