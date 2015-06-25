package lab36;
/**
 * Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл. Объект логгера должен быть создан с
 * помощью ШП Singleton. У объекта должен быть обязательным один метод, получающий на вход текст сообщения об ошибке
 * и записывающий его в файл вместе с информацией о дате и времени проишествия
 */

import java.io.IOException;

public class Lab36Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance();
        logger.writeLog("Error! File not found!");
    }
}
