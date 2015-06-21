package logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

/**
 * Created by asus on 12.06.2015.
 */
public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        try {
            int i = 2 % 0;
        } catch (Exception e) {
            logger.writeMessage(Arrays.toString(e.getStackTrace()));
        }

        try {
            new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            logger.writeMessage(Arrays.toString(e.getStackTrace()));
        }
    }
}
