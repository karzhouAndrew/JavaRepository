package lab36;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger inst;

    public static Logger getInstance() {
        if (inst == null) {
            inst = new Logger();
        }
        return inst;
    }

    public void writeLog(String errorMessage) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("logs.txt", true);
            String currentDateTime = currentDateTime();
            fileWriter.write(currentDateTime);
            fileWriter.write(" " + errorMessage);
            fileWriter.write("\n");
        } finally {
            fileWriter.close();
        }
    }

    public String currentDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        return simpleDateFormat.format(now);
    }
}
