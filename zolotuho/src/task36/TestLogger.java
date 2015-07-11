package task36;

import java.io.IOException;
//Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл.
// Объект логгера должен быть создан с помощью ШП Singleton.
// У объекта должен быть обязательным один метод,
// получающий на вход текст сообщения об ошибке и записывающий его в файл вместе с информацией о дате и времени проишествия.
public class TestLogger {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance("./src/task36/log.txt");
        try {
            int[] array = new int[1];
            array[5] = 0;
        } catch (Exception e) {
            logger.log(e);
        }
        try {
            int zero = 0;
            int number = 1 / zero;

        } catch (Exception e) {
            logger.log(e);
        }
    }
}
