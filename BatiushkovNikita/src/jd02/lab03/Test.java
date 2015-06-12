package jd02.lab03;
/*
Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл.
Объект логгера должен быть создан с помощью ШП Singleton.
У объекта должен быть обязательным один метод, получающий на вход текст сообщения об ошибке и
записывающий его в файл вместе с информацией о дате и времени проишествия.
*/
public class Test {
    public static void main(String[] args) {
        EasyLogger easyLogger = EasyLogger.getInstance();
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();

        easyLogger.loggingException(exceptionGenerator.getIOException());
        easyLogger.loggingException(exceptionGenerator.getClassCastException());
        easyLogger.loggingException(exceptionGenerator.getNullPointerException());
    }
}
