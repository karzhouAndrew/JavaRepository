package lab30;

// Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab30 {
    private final static StringBuilder text = new StringBuilder();
    private final static int TEXT_LENGTH = 50;
    private final static String FILE_PATH = "./BatiushkovNikita/src/lab30/Lab30.txt";

    public static void main(String[] args) {
        writeFile();
        readFile();
        System.out.println("Amount punctuation marks in text: " + countRegExpMatches("\\p{Punct}", text));
        System.out.println("Amount words in text: " + countRegExpMatches("[A-Za-z0-9]+", text));
    }

    public static void writeFile() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
            dataOutputStream.writeBytes(generateRandomText(TEXT_LENGTH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try (Scanner scanner = new Scanner(new FileReader(FILE_PATH))) {
            while (scanner.hasNext()) {
                createText(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static String generateRandomText(int length) {
        int asciiDownLimit = 32;
        int asciiUpLimit = 126;
        for (int i = 0; i < length; i++) {
            char randomSymbol = (char) (Math.random() * (asciiUpLimit - asciiDownLimit) + asciiDownLimit + 1);
            text.append(randomSymbol);
        }
        return text.toString();
    }

    public static void createText(String str) {
        text.delete(0, TEXT_LENGTH);
        text.append(str);
    }

    public static int countRegExpMatches(String regExp, StringBuilder text) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find())
            count++;
        return count;
    }
}