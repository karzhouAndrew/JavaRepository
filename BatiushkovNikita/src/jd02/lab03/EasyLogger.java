package jd02.lab03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class EasyLogger {
    private static EasyLogger instance;
    private String path = "./BatiushkovNikita/src/jd02/lab03/ExceptionLog.txt";

    private EasyLogger() {
    }

    public static synchronized EasyLogger getInstance() {
        if (instance == null) {
            instance = new EasyLogger();
        }
        return instance;
    }

    public void loggingException(String text) {
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
