package lab30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {

    private String processingText;
    private final String WORD_COUNT_PATTERN = "[А-Яа-яЁёA-Za-z]+";
    private final String PUNCT_COUNT_PATTERN = "\\p{Punct}";

    public void readText(String input_txt_file_path) {
        try (BufferedReader inputText = new BufferedReader(new FileReader(input_txt_file_path))) {
            StringBuilder stringBuilder = new StringBuilder();
            String currentLine = inputText.readLine();
            while (currentLine != null) {
                stringBuilder.append(currentLine).append('\n');
                currentLine = inputText.readLine();
            }
            processingText = stringBuilder.toString();
        } catch (FileNotFoundException e) {
            System.out.println("Не найден следующий файл: " + input_txt_file_path);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int countPunctMarksQuantity() {
        if (processingText == null) {
            return 0;
        }
        int punctCounter = 0;
        Pattern patternPunct = Pattern.compile(PUNCT_COUNT_PATTERN);
        Matcher matcher = patternPunct.matcher(processingText);
        while (matcher.find()) {
            punctCounter++;
        }
        return punctCounter;
    }

    public int countWordsQuantity() {
        if (processingText == null) {
            return 0;
        }
        int wordCounter = 0;
        Pattern patternWord = Pattern.compile(WORD_COUNT_PATTERN);
        Matcher matcher = patternWord.matcher(processingText);
        while (matcher.find()) {
            wordCounter++;
        }
        return wordCounter;
    }
}