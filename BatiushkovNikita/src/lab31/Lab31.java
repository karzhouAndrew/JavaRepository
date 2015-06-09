package lab31;

// Имеется файл с текстом, в котором присутствуют числа.
// Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab31 {
    private static final String PATH = "./BatiushkovNikita/src/lab31/Lab31.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(PATH);
        if (!file.canRead()) {
            System.out.println("File not found");
            throw new IOException();
        } else {
            List<Integer> values = convertStrToInt(retrieveNumbers(readFile(PATH)));
            System.out.println("Found the following numbers in the file: " + values);
            System.out.println("Sum of the numbers: " + calculateSequenceAmount(values));
            System.out.println("Retrieve unique values: " + retrieveUniqueValues(values));
        }
    }

    public static List<String> readFile(String path) {
        List<String> data = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNext()) {
                data.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return data;
    }

    public static List<String> retrieveNumbers(List<String> data) {
        List<String> strValues = new ArrayList<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher;
        for (String str : data) {
            matcher = pattern.matcher(str);
            while (matcher.find()) {
                strValues.add(matcher.group());
            }
        }
        return strValues;
    }

    public static List<Integer> convertStrToInt(List<String> strValues) {
        List<Integer> intValues = new ArrayList<>();
        for (String value : strValues) {
            intValues.add(Integer.parseInt(value));
        }
        return intValues;
    }

    public static int calculateSequenceAmount(List<Integer> values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static List<Integer> retrieveUniqueValues(List<Integer> values) {
        List<Integer> uniqueValues = new ArrayList<>();
        for (int value : values) {
            if (!uniqueValues.contains(value)) {
                uniqueValues.add(value);
            }
        }
        return uniqueValues;
    }
}