package lab36;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Master on 12.06.2015.
 */
public class CreateLogger {
    private static CreateLogger instance;

    private CreateLogger() {
    }

    public static synchronized CreateLogger getInstance() {
        if (instance == null) {
            instance = new CreateLogger();
        }
        return instance;
    }

    public void writeFile(String messageError) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./src/lab36/log.txt", true))) {
            bufferedWriter.write(messageError);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
