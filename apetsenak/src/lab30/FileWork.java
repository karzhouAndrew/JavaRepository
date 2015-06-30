package lab30;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWork {
    private final String WORD_REGEX = "[\\p{Punct}\\s]+";
    private final String PUNCTUATION_REGEX = "[А-Яа-я0-9\\s]+";
    private String text;

    public void readFile(String fileName) {
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(fileName));
            readText(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readText(BufferedReader file) throws IOException {
        StringBuilder textBuffer = new StringBuilder();
        String line = file.readLine();
        while (line != null) {
            textBuffer.append(line);
            line = file.readLine();
        }
        text = textBuffer.toString();
    }

    public int wordsCount() {
        return text.split(WORD_REGEX).length;
    }

    public int punctuationsCount() {
        return text.split(PUNCTUATION_REGEX).length - 1;
    }

    @Override
    public String toString() {
        return "FileText : \n" + text;
    }
}
