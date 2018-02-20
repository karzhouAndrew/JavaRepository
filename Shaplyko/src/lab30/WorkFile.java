package lab30;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WorkFile {
    private final String WORD = "[ \t\n]+";
    private final String PUNCTUATION = "\\p{Punct}";
    private final String END_STRING = "\\Z";
    private String text;

    public void enterFile() throws IOException {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("./src/copyBytes.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Нажмите 0 для окончания ввода текста");
        System.out.println("Введите текст:");
        while (true) {
            char str = (char) in.read();
            out.write(str);
            if (str == '0') {
                break;
            }
        }
    }

    public void outputFile() {
        try {
            Scanner scanner = new Scanner(new File("./src/copyBytes.txt"));
            scanner.useDelimiter(END_STRING);
            text = scanner.next();
            scanner.close();
            System.out.println("Текст:\n" + text);

        } catch (FileNotFoundException e) {
            System.err.println("Can't find input file!");
        } catch (NoSuchElementException e) {
            System.err.println("Can't read from input file!");
        }
    }

    public int amountWord() {
        return text.split(WORD).length;
    }

    public int amountPunctuation() {
        return text.split(PUNCTUATION).length - 1;
    }
}

