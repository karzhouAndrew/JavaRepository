package task31;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFile {
    private List<String> text;
    private final String FILE_NAME;
    private final String NUMBER_PATTERN = "\\p{Digit}*";

    public TextFile(String fileName) {
        FILE_NAME = fileName;
        text = new ArrayList<String>();
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

    public List<Integer> searchNumbers() {
        List<Integer> result = new ArrayList<Integer>();
        for (String line : text) {
            Pattern pattern = Pattern.compile(NUMBER_PATTERN);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String stringNumber = line.substring(matcher.start(), matcher.end());
                Scanner numbersScanner = new Scanner(stringNumber);
                while (numbersScanner.hasNextInt()) {
                    result.add(numbersScanner.nextInt());
                }
                numbersScanner.close();
            }
        }
        return result;
    }

    public int calcSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public List<Integer> deleteRepeatingNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>(numbers);
        for (int i = 0; i < result.size(); i++) {
            int number = result.get(i);
            Iterator<Integer> iterator = result.listIterator(i + 1);
            while (iterator.hasNext()) {
                if (iterator.next() == number) {
                    iterator.remove();
                }
            }
        }
        return result;
    }
}
