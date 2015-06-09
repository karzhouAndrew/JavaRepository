package lab32;

// Записать в двоичный файл 20 случайных чисел. Прочитать записан-ный файл, распечатать числа и их среднее арифметическое.

import java.util.ArrayList;
import java.util.List;

public class Lab32 {
    private static final String PATH = "./BatiushkovNikita/src/lab32/Lab32.txt";
    private static final int QUANTITY = 20;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        FileManager fileManager = new FileManager(PATH);
        fileManager.createFile();
        fileManager.writeFile(convertIntToStr(generateIntegers(QUANTITY, MIN_VALUE, MAX_VALUE)));
        List<Integer> values = convertStrToInt(fileManager.readFile());
        System.out.println("Random numbers: " + values);
        System.out.println("Average: " + calculateAverage(values));
    }

    public static int calculateAverage(List<Integer> values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public static List<Integer> convertStrToInt(List<String> strValues) {
        List<Integer> intValues = new ArrayList<>();
        for (String value : strValues) {
            intValues.add(Integer.parseInt(value));
        }
        return intValues;
    }

    public static List<String> convertIntToStr(List<Integer> intValues) {
        List<String> strValues = new ArrayList<>();
        for (Integer value : intValues) {
            strValues.add(value.toString());
        }
        return strValues;
    }

    public static List<Integer> generateIntegers(int quantity, int minValue, int maxValue) {
        List<Integer> intValues = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            intValues.add(generateRandomInt(minValue, maxValue));
        }
        return intValues;
    }

    public static int generateRandomInt(int minValue, int maxValue) {
        return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
    }
}