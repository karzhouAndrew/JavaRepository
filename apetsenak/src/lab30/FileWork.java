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
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(fileName));
            readText(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readText(BufferedReader buffer) throws IOException {
        StringBuilder textBuffer = new StringBuilder();
        String line = buffer.readLine();
        while (line != null) {
            textBuffer.append(line);
            line = buffer.readLine();
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
