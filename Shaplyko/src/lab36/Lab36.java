package lab36;

import java.io.File;

/**
 * Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл. Объект логгера должен быть создан
 * с помощью ШП Singleton. У объекта должен быть обязательным один метод, получающий на вход текст сообщения об
 * ошибке и записывающий его в файл вместе с информацией о дате и времени проишествия.
 */
public class Lab36 {
    private static final String ERROR_MESSAGE = "Произоша непоправимая ошибка";

    public static void main(String[] args) {
        File file = new File(".loggerFile.txt");
        Logger logger = Logger.getInstance();
        logger.writeFile(ERROR_MESSAGE, file);
    }
}
