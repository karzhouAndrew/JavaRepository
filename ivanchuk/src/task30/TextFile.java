package task30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFile {
    private final String FILE_NAME;
    private List<String> text;

    public TextFile(String fileName) {
        text = new ArrayList<String>();
        FILE_NAME = fileName;
    }

    public boolean readFile() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            String line = bufferedReader.readLine();
            while (line != null) {
                text.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    return false;
                }
            }
        }
        return true;
    }

    public int calcPunctuationQuantity() {
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text.get(0));
        int quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        for (int i = 1; i < text.size(); i++) {
            matcher.reset(text.get(i));
            while (matcher.find()) {
                quantity++;
            }
        }
        return quantity;
    }

    public int calcWordsQuantity() {
        int wordQuantity = 0;
        for (String line : text) {
            String textWithoutSpace = line.trim();
            int quantity = textWithoutSpace.length() != 0 ? 1 : 0;
            int currentSearchPosition = 0;
            while (currentSearchPosition != -1) {
                int lastSearchPosition = currentSearchPosition;
                currentSearchPosition = textWithoutSpace.indexOf(' ', lastSearchPosition);
                if (currentSearchPosition != -1) {
                    if (currentSearchPosition - lastSearchPosition > 0) {
                        quantity++;
                    }
                    currentSearchPosition++;
                }
            }
            wordQuantity += quantity;
        }
        return wordQuantity;
    }
}
