package servletRequestCounter;

import java.io.*;

public class CountFileManager {
    public static final String PATH = "./counterLog.dat";

    public static void createFile() {
        File file = new File(CountFileManager.PATH);
        if (!file.exists()) {
            try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
                out.writeInt(0);
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int incrementRequestQuantity() {
        int counter = 0;
        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(PATH)))) {
            counter = input.readInt();
            counter++;
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(PATH)));
            out.writeInt(counter);
            input.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }
}
