package lab36;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void writeFile(String message, File file) {
        DataOutputStream outputFile = null;
        try {
            outputFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            outputFile.writeUTF(message);
            getTime(outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Не могу открыть файл");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        } finally {
            if (outputFile != null) {
                try {
                    outputFile.close();
                } catch (IOException e) {
                    System.out.println("Не могу закрыть файл");
                }
            }
        }
    }

    private void getTime(DataOutputStream outputFile) throws IOException {
        Date now = new Date();
        outputFile.writeUTF(DateFormat.getDateTimeInstance().format(now));
    }
}

