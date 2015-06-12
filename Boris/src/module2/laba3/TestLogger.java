package module2.laba3;


import java.util.Date;
import java.util.Random;

public class TestLogger {
    public static void main(String[] args) {
        startGenerateException(new Random().nextInt(100));
        System.out.println(Logger.getInstanceLogger().getTextFromFile());
    }

    private static void startGenerateException(int start) {
        try {
            for (int i = start; i < 100; i++) {
                if (i % 17 == 0) {
                    throw new IllegalArgumentException("i = " + String.valueOf(i) + "\t");
                } else if (i % 7 == 0) {
                    throw new NullPointerException("i = " + String.valueOf(i) + "\t");
                } else if (i % 13 == 0) {
                    throw new NumberFormatException("i = " + String.valueOf(i) + "\t");
                }
            }
        } catch (NumberFormatException e) {
            writeText(start, e);
        } catch (IllegalArgumentException | NullPointerException e) {
            writeText(start, e);
        }
    }

    private static void writeText(int start, RuntimeException e) {
        Logger.getInstanceLogger().writeMessage(new Date().toString() + "\t" + e);
        startGenerateException(start + 10);
    }
}



