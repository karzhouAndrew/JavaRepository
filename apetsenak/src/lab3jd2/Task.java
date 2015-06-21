package lab3jd2;

import java.io.IOException;

/**
 * Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл.
 * Объект логгера должен быть создан с помощью ШП Singleton.
 * У объекта должен быть обязательным один метод, получающий на вход текст сообщения об ошибке
 * и записывающий его в файл вместе с информацией о дате и времени проишествия.
 */
public class Task {
    public static void main(String[] args) {
        FirstTest firstTest = new FirstTest();
        SecondTest secondTest = new SecondTest();
        firstTest.exceptionThrowing();
        secondTest.exceptionThrowing();
    }
}
