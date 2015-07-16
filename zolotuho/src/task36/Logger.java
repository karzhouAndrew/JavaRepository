package task36;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {
    private String path;
    private static Logger instance;

    private Logger(String path) {
        this.path = path;
    }

    public static Logger getInstance(String path) {
        return instance == null ? instance = new Logger(path) : instance;
    }

    public void log(Throwable e) throws IOException {
        Date date = new Date();
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
        printWriter.append(date.toString() + " \n");
        StackTraceElement[] trace = e.getStackTrace();
        printWriter.write(e.toString() + " \n");
        for (StackTraceElement stackTraceElement : trace) {
            printWriter.append(stackTraceElement.toString());
            printWriter.append(" \n");
        }
        printWriter.append(" \n");
        printWriter.close();
    }
}
