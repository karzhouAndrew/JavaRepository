package task31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Имеется файл с текстом, в котором присутствуют числа.
// Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.
public class FileNumbersRedactor {
    private final String numbersRegex = "^-?\\d+$|^-?\\d+[.]\\d+$";
    private final String wordsRegex = "[.,:;][ ]+|[ ]+|[.!?]$";

    public List<Double> findNumbers(File path) throws IOException, NumberFormatException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String currentString = bufferedReader.readLine();
        Pattern pattern = Pattern.compile(numbersRegex);
        List<Double> numbersFromText = new ArrayList<Double>();
        while (currentString != null) {
            currentString = currentString.trim();
            String[] words = currentString.split(wordsRegex);
            for (int i = 0; i < words.length; i++) {
                Matcher matcher = pattern.matcher(words[i]);
                if (matcher.find()) {
                    Double currentValue = Double.parseDouble(words[i]);
                    numbersFromText.add(currentValue);
                }
            }
            currentString = bufferedReader.readLine();
        }
        bufferedReader.close();
        return numbersFromText;
    }

    public Set<Double> convertToSet(List<Double> numbersFromText) {
        Set<Double> uniqueNumbersFromText = new HashSet<Double>(numbersFromText);
        return uniqueNumbersFromText;
    }

    public double sumNumbers(List<Double> numbersFromText) {
        Iterator<Double> iterator = numbersFromText.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}
