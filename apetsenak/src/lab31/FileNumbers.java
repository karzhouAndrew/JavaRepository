package lab31;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNumbers {
    public static final String NUMBERS_REGEX = "(?:\\d*\\.)?\\d+";
    private List<Double> numbers = new ArrayList<>();

    public void addNumbers(String fileName) {
        String fileText = readFile(fileName);
        Pattern pattern = Pattern.compile(NUMBERS_REGEX);
        Matcher matcher = pattern.matcher(fileText);
        while (matcher.find()) {
            numbers.add(Double.parseDouble(matcher.group()));
        }
    }

    public String readFile(String fileName) {
        StringBuilder fileText = new StringBuilder();
        try (BufferedReader inputBuffer = new BufferedReader(new FileReader(fileName))) {
            String readLine = inputBuffer.readLine();
            while (readLine != null) {
                fileText.append(readLine);
                readLine = inputBuffer.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileText.toString();
    }

    public Double calculateSum() {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public void removeDuplicate() {
        ArrayList<Double> result = new ArrayList<>(new HashSet<>(numbers));
        Collections.sort(result);
        numbers = result;
    }

    @Override
    public String toString() {
        return "FileNumbers{" +
                "numbers=" + numbers +
                '}';
    }
}
