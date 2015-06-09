package filePractice01;

// Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.

import java.util.Arrays;
import java.util.Comparator;


public class Task {
    private static final String PATH = "./BatiushkovNikita/src/filePractice01/Dir/IntegerFile.txt";
    private static final int QUANTITY = 50;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        FileManager fileManager = new FileManager(PATH);
        fileManager.createFile();
        Integer[] intSequence;
        String[] strSequence;

        intSequence = generateRandomIntegers(QUANTITY, MIN_VALUE, MAX_VALUE);
        fileManager.writeFile(convertToStringSequence(intSequence));

        strSequence = fileManager.readFile();
        intSequence = convertToIntegerSequence(strSequence);

        Integer[] sortedSequence = sortIntegers(intSequence);
        strSequence = convertToStringSequence(sortedSequence);

        fileManager.writeFile(strSequence);
    }

    public static Integer[] sortIntegers(Integer[] values) {
        Arrays.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer value1, Integer value2) {
                return value1.compareTo(value2);
            }
        });
        return values;
    }

    public static Integer[] convertToIntegerSequence(String[] strValues) {
        int size = strValues.length;
        Integer[] intValues = new Integer[size];
        for (int i = 0; i < size; i++) {
            intValues[i] = Integer.parseInt(strValues[i]);
        }
        return intValues;
    }

    public static String[] convertToStringSequence(Integer[] intValues) {
        int size = intValues.length;
        String[] strValues = new String[size];
        for (int i = 0; i < size; i++) {
            strValues[i] = Integer.toString(intValues[i]);
        }
        return strValues;
    }

    public static Integer[] generateRandomIntegers(int quantity, int minValue, int maxValue) {
        Integer[] values = new Integer[quantity];
        for (int i = 0; i < values.length; i++) {
            values[i] = generateRandomInt(minValue, maxValue);
        }
        return values;
    }

    public static int generateRandomInt(int minValue, int maxValue) {
        return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
    }
}
