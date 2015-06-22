package bufferChallenge;

// Buffer performance test

import java.io.*;

public class BufferChallenge {
    private final static int SIZE = 10000;
    private final static String FILE_PATH = "./BatiushkovNikita/src/bufferChallenge/bufferChallenge.txt";

    public static void main(String[] args) {
        System.out.println(SIZE + " symbols.");

        long startWriteFile = System.currentTimeMillis();
        writeFile();
        long stopWriteFile = System.currentTimeMillis();
        System.out.println("Direct writing: " + (stopWriteFile - startWriteFile) + " ms.");

        long startWriteFileBuffer = System.currentTimeMillis();
        writeFileBuffer();
        long stopWriteFileBuffer = System.currentTimeMillis();
        System.out.println("Buffer writing: " + (stopWriteFileBuffer - startWriteFileBuffer) + " ms.");
    }

    public static void writeFileBuffer() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(FILE_PATH)))) {
            for (int i = 0; i < SIZE; i++) {
                dataOutputStream.writeChar(generateAsciiCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
            for (int i = 0; i < SIZE; i++) {
                dataOutputStream.writeChar(generateAsciiCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int generateAsciiCode() {
        int asciiDownLimit = 32;
        int asciiUpLimit = 126;
        return (char) (Math.random() * (asciiUpLimit - asciiDownLimit) + asciiDownLimit + 1);
    }
}