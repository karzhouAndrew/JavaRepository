package bufferChallenge;

// Запись в файл через буфер и на прямую.

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferChallenge {
    private final static int LENGTH = 100;
    private final static StringBuilder TEXT = new StringBuilder();
    private final static String FILE_PATH = ".BatiushkovNikita/src/bufferChallenge/bufferChallenge.txt";

    public static void main(String[] args) {
        System.out.println(generateRandomSymbol());

    }

    public static void writeFile() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
            dataOutputStream.writeBytes(generateRandomSymbol());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static String generateRandomSymbol() {
        int asciiDownLimit = 32;
        int asciiUpLimit = 126;
        StringBuilder stringBuilder = new StringBuilder();
        char randomSymbol = (char) (Math.random() * (asciiUpLimit - asciiDownLimit) + asciiDownLimit + 1);
        stringBuilder.append(randomSymbol);
        return stringBuilder.toString();
    }

}
