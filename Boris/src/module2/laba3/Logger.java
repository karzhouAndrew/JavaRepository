package module2.laba3;

//Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл.
//        Объект логгера должен быть создан с помощью ШП Singleton. У объекта должен быть
//        обязательным один метод, получающий на вход текст сообщения об ошибке и записывающий его
//        в файл вместе с информацией о дате и времени проишествия.

import java.io.*;
import java.util.Date;

public class Logger {
    private static Logger logger;
    private static File file;

    private Logger() {
        file = new File("./Boris/src/module2/temp.txt");
        if (file.exists()) {
            clearFile();
        } else {
            file.getParentFile().mkdirs();
        }
    }

    public static synchronized Logger getInstanceLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public StringBuilder getTextFromFile() {
        StringBuilder text = new StringBuilder();
        try (BufferedReader strB = new BufferedReader(new FileReader(file))) {
            String reader;
            while ((reader = strB.readLine()) != null) {
                text.append(reader).append("\n");
            }
        } catch (IOException e) {
            addMessage(new Date().toString() + e.getMessage());
        }
        return text;
    }

    public void addMessage(String str) {
        writeOrAddToFile(str + "\n", true);
    }

    private void clearFile() {
        writeOrAddToFile("", false);
    }

    private void writeOrAddToFile(String str, boolean add) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, add))) {
            writer.append(str);
        } catch (IOException e) {
            addMessage(new Date().toString() + e);
        }
    }


}
