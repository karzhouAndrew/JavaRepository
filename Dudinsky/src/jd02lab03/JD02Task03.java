package jd02lab03;

/*Задание 3. Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл. Объект логгера должен быть
создан с помощью ШП Singleton. У объекта должен быть обязательным один метод, получающий на вход текст сообщения
об ошибке и записывающий его в файл вместе с информацией о дате и времени проишествия. */

import java.io.FileNotFoundException;
import java.util.Arrays;

public class JD02Task03 {

    private static final String LOG_FILE_PATH = "./Dudinsky/src/jd02lab03/test.log";

    public static void main(String[] args) {
        Logger.getInstance(LOG_FILE_PATH).writeToFile("Это тестовое сообщение об ошибке.");
        testCaughtExceptionLogging(Logger.getInstance(LOG_FILE_PATH));
    }

    private static void testCaughtExceptionLogging(Logger logger) {
        try {
            throw new FileNotFoundException("Это тестовый FileNotFoundException.");
        } catch (FileNotFoundException e) {
            logger.writeToFile(e.getMessage() + '\n' + Arrays.toString(e.getStackTrace()));
        }
    }
}
