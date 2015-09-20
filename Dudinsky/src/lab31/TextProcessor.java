package lab31;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {

    private String processingText;
    private final String NUMBER_PATTERN = "-?\\d+\\.?\\d*";

    public void readText(String inputTxtFilePath) throws IOException {
        try (BufferedReader inputText = new BufferedReader(new FileReader(inputTxtFilePath))) {
            StringBuilder stringBuilder = new StringBuilder();
            String currentLine;
            while ((currentLine = inputText.readLine()) != null) {
                stringBuilder.append(currentLine).append('\n');
            }
            processingText = stringBuilder.toString();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Не найден следующий файл: " + inputTxtFilePath);
        }
    }

    public List<Double> findAllNumbers() {
        if (processingText == null) {
            return null;
        }
        List<Double> foundNumbers = new ArrayList<>();
        Pattern numPattern = Pattern.compile(NUMBER_PATTERN);
        Matcher matcher = numPattern.matcher(processingText);
        while (matcher.find()) {
            foundNumbers.add(Double.parseDouble(matcher.group()));
        }
        return foundNumbers;
    }

}
