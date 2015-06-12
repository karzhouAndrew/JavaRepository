package logger;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by asus on 12.06.2015.
 */
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

    public void writeMessage(String message) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("log.txt", true));
            StringBuilder stringBuilder = new StringBuilder();
            Date dateNow = new Date();
            DateFormat dateFormat = DateFormat.getDateTimeInstance();
            stringBuilder.append(dateFormat.format(dateNow));
            stringBuilder.append("\n");
            stringBuilder.append(message);
            stringBuilder.append("\n");
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
