package jd02.lab03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class Logger {
    private static Logger instance;
    private String path = "./BatiushkovNikita/src/jd02/lab03/ExceptionLog.txt";

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logException(String text) {
        String message = getTime() + "  " + text;
        writeFile(message);
    }

    private String getTime() {
        return Calendar.getInstance().getTime().toString();
    }

    private void writeFile(String data) {
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(path, true)))) {
            printWriter.append(data).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPath() {
        return path;
    }
}
