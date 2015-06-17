package lab3jd2;


import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Logger {
    private static Logger instance;
    private File logFile = new File("log.txt");

    private Logger() {
        try {
            if (!logFile.exists()) {
                logFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(Exception exception) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFile, true))) {
            writeFile(exception, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(Exception exception, PrintWriter writer) {
        Calendar time = new GregorianCalendar();
        StringBuilder writeLine = new StringBuilder(time.getTime().toString());
        writeLine.append("  Message : ");
        writeLine.append(exception.toString());
        writer.println(writeLine.toString());
        for (StackTraceElement trace : exception.getStackTrace()) {
            writer.println(trace.toString());
        }
        writer.println();
    }
}
