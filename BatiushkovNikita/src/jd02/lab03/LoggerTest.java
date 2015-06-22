package jd02.lab03;

/*
Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл.
Объект логгера должен быть создан с помощью ШП Singleton.
У объекта должен быть обязательным один метод, получающий на вход текст сообщения об ошибке и
записывающий его в файл вместе с информацией о дате и времени проишествия.
*/
public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();

        logger.logException(exceptionGenerator.getMessageIOException());
        logger.logException(exceptionGenerator.getMessageClassCastException());
        logger.logException(exceptionGenerator.getMessageNullPointerException());
    }
}
