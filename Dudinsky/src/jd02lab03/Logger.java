package jd02lab03;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Logger {

    private static String logFilePath;
    private static Logger instance;

    private Logger() {
    }

    public static synchronized Logger getInstance(String path) {
        if (instance == null) {
            instance = new Logger();
        }
        logFilePath = path;
        return instance;
    }

    public synchronized void writeToFile(String message) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.getDefault());
        try (Writer writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
            writer.write(dateFormat.format(new Date()) + '\n' + message + "\n-------------------\n");
        } catch (FileNotFoundException e) {
            System.err.println("Log-file not found: " + logFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
